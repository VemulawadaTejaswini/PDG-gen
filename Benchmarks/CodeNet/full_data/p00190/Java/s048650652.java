import java.util.*;
public class Main {
	int [][] start;
	final int [] xdir = {0,1,0,-1};
	final int [] ydir = {1,0,-1,0};

	public class C {
		int deep;
		StringBuilder data;
		public C(int deep, String data) {
			this.deep = deep;
			this.data = new StringBuilder(data);
		}
	}

	private int[] getIndex(int ind){
		for(int i=0; i < 7; i++){
			for(int j=0; j < 7; j++){
				if(start[i][j] == ind){
					int [] ans = {j,i};
					return ans;
				}
			}
		}
		return null;
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		LinkedList<C> open = new LinkedList<C>();
		HashMap<String,Integer> close = new HashMap<String, Integer>();
		start = new int[7][7];
		for(int i=0; i < 7; i++){
			Arrays.fill(start[i], -1);
		}
		start[1][3] = 0;
		start[2][2] = 1;
		start[2][3] = 2;
		start[2][4] = 3;
		start[3][1] = 4;
		start[3][2] = 5;
		start[3][3] = 6;
		start[3][4] = 7;
		start[3][5] = 8;
		start[4][2] = 9;
		start[4][3] = 10;
		start[4][4] = 11;
		start[5][3] = 12;
		open.addLast(new C(0,"0123456789ab0"));
		close.put("0123456789ab0", 0);

		while(! open.isEmpty()){
			C pat = open.remove();
			StringBuilder patStr = pat.data;
			int patDeep = pat.deep;
			int lastInd = 0;
			if(patDeep >= 10){
				open.clear();
				break;
			}

			for(int i=0; i < 2; i++){
				int ind = patStr.indexOf("0", lastInd);
				int [] result = getIndex(ind);
				int x = result[0];
				int y = result[1];

				for(int j=0; j < 4; j++){
					int patX = x + xdir[j];
					int patY = y + ydir[j];
					if(start[patY][patX] >= 0){
						StringBuilder newStr = new StringBuilder(patStr.toString());
						char change = newStr.charAt(start[patY][patX]);
						newStr.setCharAt(ind, change);
						newStr.setCharAt(start[patY][patX], '0');
						String temp = newStr.toString();

						if((! close.containsKey(temp))){
							open.addLast(new C(patDeep + 1, temp));
							close.put(temp, patDeep+1);
						}
					}
				}
				lastInd = ind + 1;
			}
		}

		while(true){
			int n = sc.nextInt();
			if(n == -1){
				break;
			}
			StringBuilder input = new StringBuilder();
			if(n == 10){
				input.append('a');
			}
			else if(n == 11){
				input.append('b');
			}
			else{
				input.append("" + n);
			}

			for(int i=0; i < 12; i++){
				n = sc.nextInt();
				if(n == 10){
					input.append('a');
				}
				else if(n == 11){
					input.append('b');
				}
				else{
					input.append("" + n);
				}
			}
			String inputStr = input.toString();

			if(close.containsKey(inputStr)){
				System.out.println(close.get(inputStr));
			}
			else{
				open.addLast(new C(0,inputStr));
				HashMap<String,Integer> anotherclose = new HashMap<String, Integer>();
				anotherclose.put(inputStr, 0);
				while(! open.isEmpty()){
					C pat = open.remove();
					StringBuilder patStr = pat.data;
					int patDeep = pat.deep;
					int lastInd = 0;

					if((close.containsKey(patStr.toString()))){
						System.out.println(patDeep + close.get(patStr.toString()));
						break;
					}

					if(patDeep >= 11){
						System.out.println("NA");
						break;
					}

					for(int i=0; i < 2; i++){
						int ind = patStr.indexOf("0", lastInd);
						int [] result = getIndex(ind);
						int x = result[0];
						int y = result[1];

						for(int j=0; j < 4; j++){
							int patX = x + xdir[j];
							int patY = y + ydir[j];
							if(start[patY][patX] >= 0){
								StringBuilder newStr = new StringBuilder(patStr.toString());
								char change = newStr.charAt(start[patY][patX]);
								newStr.setCharAt(ind, change);
								newStr.setCharAt(start[patY][patX], '0');
								String temp = newStr.toString();

								if((! anotherclose.containsKey(temp))){
									open.addLast(new C(patDeep + 1, temp));
									anotherclose.put(temp, patDeep+1);
								}
							}
						}
						lastInd = ind + 1;
					}
				}

			}
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}