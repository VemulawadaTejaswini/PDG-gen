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

	private String getStr(int [][] array){
		StringBuilder str = new StringBuilder();
		for(int i=0; i < 2; i++){
			for(int j=0; j < 4; j++){
				str.append(""+array[i][j]);
			}
		}
		return str.toString();
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int [] dir = {-1,1,4,-4};
		while(sc.hasNext()){
			LinkedList<C> open = new LinkedList<C>();
			HashSet<String> close =  new HashSet<String>();

			StringBuilder st = new StringBuilder();
			for(int i=0; i < 2; i++){
				for(int j=0; j < 4; j++){
					st.append(sc.next());
				}
			}
			String input = st.toString();
			open.addFirst(new C(0,input));
			close.add(input);

			while(! open.isEmpty()){
				C pat = open.getFirst();

				open.removeFirst();
				StringBuilder patStr = pat.data;


				if(patStr.toString().equals("01234567")){
					System.out.println(pat.deep);
					break;
				}

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
						if(! close.contains(newStr)){
							open.addLast(new C(pat.deep+1,newStr));
							close.add(newStr);
						}
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