import java.util.*;
public class Main {
    /* 
    public static boolean isPalindrome(String str, int start, int end){
      if( end - start <= 1){
        return true;
      }
      else{
        if(str.indexOf(start) == str.indexOf(end)){
        	return isPalindrome(str,start+1,end-1);
        }
        else{
        	return false;
        }
      }
    }
    */
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
      	int len = str.length();
 		String leftfStr = str.substring(0,(len-1)/2);
      	String rightStr = str.substring((len+1)/2,len);
      	boolean isStrongPalindrome = new StringBuffer(leftStr).reverse().toString().equals(leftStr)
          && new StringBuffer(rightStr).reverse().toString().equals(rightStr)
          && new StringBuffer(str).reverse().toString().equals(str);
          
		System.out.println(isStrongPalindrome?"Yes":"No");
	}
}