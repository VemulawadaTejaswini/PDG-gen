import java.util.*;

public class Main {
	
//	public static String rev(int s) {
//		 String rev = new StringBuffer(s).reverse().toString();
//		 return rev;
//	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st1 = sc.next();
		String st2 = sc.next();
		int l1 = st1.length();
		char[] arr1 = st1.toCharArray();
		char[] arr2 = st2.toCharArray();
		int cnt = 0;
		for(int i = 0; i < l1; i++) {
			if(arr1[i] != arr2[i]) {
				cnt++;
			}
				
		}
       
        	
        	
        	System.out.println(cnt);
        }
         
        
        
        
	
}