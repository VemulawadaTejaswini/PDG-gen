import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String str = br.readLine();

			if(str == null){
				break;
			}

//			int[] puzzle = new int[8];

			String[] tmpArray = str.split(" ");
			char[] carray = new char[8];
			for(int i = 0; i < 8 ; i++){
//				puzzle[i] = Integer.parseInt(tmpArray[i]);
				carray[i] = tmpArray[i].charAt(0);
			}

			String input = new String(carray);
			
			int result = bfs(input);
			
			System.out.println(result);
		}
	}

	static int bfs(String puzzle){
//		System.out.println("input "+puzzle);
		ArrayDeque<State> queue = new ArrayDeque<State>();
		ArrayList<String> checked = new ArrayList<String>();

		queue.push(new State(new String(puzzle), 0));
//		int time = 0;

		while(!queue.isEmpty()){
			State tmp = queue.poll();
			if(!checked.contains(tmp.state)){
				checked.add(tmp.state);
			}
			else {
				continue;
			}
//			System.out.println("tmp "+tmp);
			if(tmp.state.equals("01234567")){
				return tmp.time;
			}

			int zeroPos = tmp.state.indexOf('0');


			//???
			if(zeroPos >= 4){
				queue.add(new State(swap(tmp.state, zeroPos, zeroPos - 4), tmp.time + 1));
			}

			//???
			if(zeroPos < 4){
				queue.add(new State(swap(tmp.state, zeroPos, zeroPos + 4), tmp.time + 1));
			}

			//???
			if(zeroPos != 0 && zeroPos != 4){
				queue.add(new State(swap(tmp.state, zeroPos, zeroPos - 1), tmp.time + 1));
			}

			//???
			if(zeroPos != 3 && zeroPos != 7){
				queue.add(new State(swap(tmp.state, zeroPos, zeroPos + 1), tmp.time + 1));
			}

			//System.out.println("now time "+tmp.time + "queue size "+queue.size());
			
		}
		
		return -1;
	}

	static String swap(String str, int index1, int index2){
		char[] carray = str.toCharArray();

		char tmp = carray[index1];
		carray[index1] = carray[index2];
		carray[index2] = tmp;

		String result = new String(carray);
		
//		System.out.println("in "+str+" out "+result);
		
		return result;
	}


}

class State{
	String state;
	int time;
	
	public State(String state, int time){
		this.state = state;
		this.time = time;
	}
}