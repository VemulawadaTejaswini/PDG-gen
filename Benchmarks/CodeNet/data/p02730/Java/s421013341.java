import java.util.*;
class Main{
  public static void main(String [] args) {
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			int len = str.length();
			String str1 = str.substring(0, (len-1)/2+1);
			String str2 = str.substring((len+3)/2);
			if(checkPal(str) && checkPal(str1) && checkPal(str2)) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
	}

	private static boolean checkPal(String str) {
		// TODO Auto-generated method stub
		int i = 0, j = str.length() - 1; 
		  
        while (i < j) { 
  
            // If there is a mismatch 
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
 
            i++; 
            j--; 
        } 
		return true;
	}
}