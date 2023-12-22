import java.util.*;

public class Main{

	//2116 start
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			ArrayList<Character> list = new ArrayList<Character>();
			String input = sc.nextLine();
			while(! input.equals("")){
				for(int i = 0; i < input.length(); i++){
					list.add(input.charAt(i));
				}
				input = sc.nextLine();
			}

			String keystr = sc.nextLine();

			HashMap<Character, Integer> index = new HashMap<Character, Integer>();
			for(int i = 0; i < keystr.length(); i++){
				index.put(keystr.charAt(i), -1);
			}

			int s = -1, e = -1, anss = -1, anse = -1;
			boolean allcontain = false;

			int len = list.size();
			int anscount= 0;
			for(int i = 0; i < len; i++){
				char now = list.get(i);
				if(! index.containsKey(now)) continue;

				if(allcontain){
					int value = index.get(now);
					index.put(now, i);
					if(s == value){
						//次の最小値をもとめる
						s = min(index);
					}
					e = i;

					//判定
					if((e - s) < (anse - anss)){
						anse = e;
						anss = s;
						anscount=1;
					}
					else if((e - s) == (anse - anss)){
						anscount++;
					}
				}
				else{

					//これで見つかったかもしれない
					index.put(now, i);
					boolean isOK = true;
					int min = Integer.MAX_VALUE, max = 0;
					for(char key: index.keySet()){
						int value = index.get(key);
						if(value == -1){
							isOK = false;
							break;
						}
						else{
							max = Math.max(max, value);
							min = Math.min(min, value);
						}
					}

					if(isOK){
						allcontain = true;
						s = min;
						e = max;
						anss = min;
						anse = max;
						anscount++;
					}
				}
			}
			System.out.println(anscount);

			if(anscount > 0){
				System.out.println();
				//System.out.println(ans);
				print(anss,anse,list);
			}
			if(sc.hasNext()){
				sc.nextLine();
				System.out.println();
			}
		}
	}

	private void print(int s, int e, ArrayList<Character> list) {
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = s; i <= e; i++ ){
			count++;
			sb.append(list.get(i));
			if(count == 72){
				count = 0;
				System.out.println(sb.toString());
				sb = new StringBuilder();
			}
		}
		if(sb.length() != 0) System.out.println(sb.toString());

	}

	private int min(HashMap<Character, Integer> index) {
		int min = Integer.MAX_VALUE;
		for(char key: index.keySet()){
			min = Math.min(min, index.get(key));
		}
		return min;
	}

	public static void main(String [] args){
		new Main().doit();
	}
}