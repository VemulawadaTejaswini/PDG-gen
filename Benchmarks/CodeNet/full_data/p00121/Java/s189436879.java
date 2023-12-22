import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

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
	
	static HashMap<String, Integer> ans = new HashMap<String, Integer>();

	static int bfs(String puzzle){
//		System.out.println("input "+puzzle);
		ArrayDeque<State> queue = new ArrayDeque<State>();
		HashSet<String> checked = new HashSet<String>();

		queue.push(new State(new String(puzzle), 0, -1));
//		int time = 0;

		while(!queue.isEmpty()){
			State tmp = queue.poll();
			if(ans.containsKey(tmp.state)){
//				System.out.println("I know the answer");
				return tmp.time + ans.get(tmp.state);
			}
			
			if(!checked.contains(tmp.state)){
				checked.add(tmp.state);
			}
			else {
				continue;
			}
			
//			System.out.println("tmp "+tmp);
			if(tmp.state.equals("01234567")){
				ans.put(new String(puzzle), (int)tmp.time);
				return tmp.time;
			}

			int zeroPos = tmp.state.indexOf('0');


			String swapped;
			//???
			if(zeroPos >= 4 && tmp.prevDir != 1){
				swapped = swap(tmp.state, zeroPos, zeroPos - 4);
				if(!checked.contains(swapped)){
					queue.add(new State(swapped, tmp.time + 1, 0));
				}
			}

			//???
			if(zeroPos < 4 && tmp.prevDir != 0){
				swapped = swap(tmp.state, zeroPos, zeroPos + 4);
				if(!checked.contains(swapped)){
					queue.add(new State(swapped, tmp.time + 1, 1));
				}
			}

			//???
			if(zeroPos != 0 && zeroPos != 4 && tmp.prevDir != 3){
				swapped = swap(tmp.state, zeroPos, zeroPos - 1);
				if(!checked.contains(swapped)){
					queue.add(new State(swapped, tmp.time + 1, 2));
				}
			}

			//???
			if(zeroPos != 3 && zeroPos != 7 && tmp.prevDir != 2){
				swapped = swap(tmp.state, zeroPos, zeroPos + 1);
				if(!checked.contains(swapped)){
					queue.add(new State(swapped, tmp.time + 1, 3));
				}
			}

//			System.out.println("now time "+tmp.time + "queue size "+queue.size()+" hash size "+checked.size());

		}
		
		Iterator<String> it = checked.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
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
	short time;
	short prevDir;

	public State(String state, int time, int dir){
		this.state = state;
		this.time = (short)time;
		this.prevDir = (short)dir;
	}
}