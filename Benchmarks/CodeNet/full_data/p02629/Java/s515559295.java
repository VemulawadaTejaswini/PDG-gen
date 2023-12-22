import java.util.*;

public class Main {
	 
	  public static String getKey(int index){
		String colCode = "";
		char key='a';
		int loop = index / 26;
		if(loop>0){
			colCode += getKey(loop-1);
		}
		key = (char) (key+index%26);
		colCode += key;
		return colCode;
	}

		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        System.out.println(getKey(n-1)); 
		}
}