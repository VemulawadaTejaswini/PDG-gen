package aoj0121;

import java.util.*;
public class Main {

	class C {
		int deep;
		StringBuilder data;
		public C(int deep, String data) {
			this.deep = deep;
			this.data = new StringBuilder(data);
		}

	}

	private boolean isRange(int ind){
		if(ind < 0 || ind >= 8){
			return false;
		}
		else{
			return true;
		}
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int [] dir = {-1,1,4,-4};
		LinkedList<C> open = new LinkedList<C>();
		HashMap<String,Integer> close =  new HashMap<String,Integer>();

		open.addFirst(new C(0,"01234567"));
		close.put("01234567", 0);

		while(! open.isEmpty()){
			C pat = open.getFirst();

			open.removeFirst();
			StringBuilder patStr = pat.data;

			int ind = patStr.indexOf("0");
			for(int i=0; i < 4; i++){
				int ind2 = ind + dir[i];

				if((ind == 3 && dir[i] == 1) || (ind == 4 && dir[i] == -1) ){
					continue;
				}

				if(isRange(ind2)){

					String newStr = patStr.toString();
					char temp = newStr.charAt(ind2);
					newStr = newStr.replace('0','*');
					newStr = newStr.replace(newStr.charAt(ind2), '0');
					newStr = newStr.replace('*',temp);
					if(! close.containsKey(newStr)){
						open.addLast(new C(pat.deep+1,newStr));
						close.put(newStr,pat.deep+1 );
					}
				}
			}
		}
		while(sc.hasNext()){
			StringBuilder st = new StringBuilder();
			for(int i=0; i < 2; i++){
				for(int j=0; j < 4; j++){
					st.append(sc.next());
				}
			}
			String input = st.toString();
			System.out.println(close.get(input));
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}