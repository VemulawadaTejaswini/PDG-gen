import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();

		int cnt = 0;
		for(int n=0;n<st.length();n++){
			if(st.charAt(n) == 'o') cnt++;
		}

		System.out.println(700 + cnt*100);
		

	}
}