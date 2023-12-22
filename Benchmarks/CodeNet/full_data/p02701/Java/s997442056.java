import java.util.*;

public class Main{
//public class abc164_c{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<String> str = new ArrayList<>();
		//String[] str = new String[n];
		String s = "";
		int kind = 0;
		boolean flag = false;

		for(int i=0; i <n; i++){
			s = scan.next();
			flag = false;
			for(int j=0; j < str.size(); j++){
				if(str.get(j).equals(s)) flag = true;
				//if(st != null ){
					//if(st.equals(s)) flag = true;
				//}
			}
			if(!flag){
				str.add(s);
				//str[i] = s;
				kind++;
			} 
		}

		System.out.println(kind);
	}

}