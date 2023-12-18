import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();

		int res=0;
		res += 9*(st.length()-1);
		res += Character.getNumericValue(st.charAt(0)-1);

		if(st.length() == 1) res = Character.getNumericValue(st.charAt(0));
		System.out.println(res);

	}
}