import java.util.*;
public class Main {
    public static boolean isPalindrome(String str){
      if(str.length() <= 1){
        return true;
      }
      else{
        if(str[0] == str[str.length()-1]){
        	return isPalindrome(str.subString(1,str.length()-1))
        }
        else{
        	return false;
        }
      }
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextline();

		boolean isStrongPalindrome = isPalindrome(str.subString(0,(str.length()+1)/2))
          && isPalindrome(str);
          
		System.out.println(isStrongPalindrome?"Yes":"No");
	}
}