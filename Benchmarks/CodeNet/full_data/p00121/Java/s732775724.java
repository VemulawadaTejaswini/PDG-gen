import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

//???????????¢?´¢
//http://itpro.nikkeibp.co.jp/article/COLUMN/20120827/418468/?SS=imgview&FD=-700917643 ??????
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		Queue<State> queue = new LinkedList<>();
		Set<Integer> set = new HashSet<>();
		while(sc.hasNextInt()){
			int[][] firstNums = new int[2][4];
			int firstZeroX = -1;
			int firstZeroY = -1;
			for(int y = 0; y < 2; y++){
				for(int x = 0; x < 4; x++){
					firstNums[y][x] = sc.nextInt();
					if(firstNums[y][x] == 0){
						firstZeroY = y;
						firstZeroX = x;
					}
				}
			}

			State firstState = new State(firstNums, firstZeroY, firstZeroX, 0);
			set.add(firstState.hashCode());
			queue.add(firstState);

			while(!queue.isEmpty()){
				State nowState = queue.poll();
				if(nowState.hashCode() == 1234567){
					System.out.println(nowState.getDepth() + 1);
					queue.clear();
					set.clear();
					break;
				}
				for(State nextState : nowState.nextMove()){
					if(!set.contains(nextState.hashCode())){
						set.add(nextState.hashCode());
						queue.add(nextState);
					}
				}
			}
			queue.clear();
			set.clear();
		}
		sc.close();
	}

}

class State {

	//???????????????????????????
	private static final int[] vy = new int[]{0, 1, 0, -1};
	private static final int[] vx = new int[]{1, 0, -1, 0};

	private int[][] nums;
	private int zeroX;
	private int zeroY;
	private int hash;
	private int depth; //??¨?????±???

	public State(int[][] nums, int zeroY, int zeroX, int depth){
		this.nums = nums;
		this.zeroY = zeroY;
		this.zeroX = zeroX;
		this.depth = depth;
		this.hash = -1;
	}

	public int getDepth(){
		return depth;
	}

	public LinkedList<State> nextMove(){
		LinkedList<State> list = new LinkedList<>();
		//???????????????4??????
		for(int i = 0; i < 4; i++){
			int nextZeroY = zeroY + vy[i];
			int nextZeroX = zeroX + vx[i];
			if(nextZeroY < 0 || nextZeroY >= 2) continue;
			if(nextZeroX < 0 || nextZeroX >= 4) continue;
			int[][] nextNums = new int[2][4];
			for(int y = 0; y < 2; y++){
				for(int x = 0; x < 4; x++){
					nextNums[y][x] = nums[y][x];
				}
			}
			nextNums[nextZeroY][nextZeroX] = 0;
			nextNums[zeroY][zeroX] = nums[nextZeroY][nextZeroX];
			list.add(new State(nextNums, nextZeroY, nextZeroX, depth + 1));
		}

		return list;
	}

	@Override
	public int hashCode(){
		if(hash != -1) return hash;
		hash = 0;
		for(int y = 0; y < 2; y++){
			for(int x = 0; x < 4; x++){
				hash *= 10;
				hash += nums[y][x];
			}
		}
		return hash;
	}

}