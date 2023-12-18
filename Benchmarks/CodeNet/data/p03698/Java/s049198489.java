import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String s = sc.next();
      char[] array = s.toCharArray();
      Arrays.sort(array);
      int count = 0;
      for(int i = 1;i < s.length();i++){
      	if(array[i]==array[i-1])count++;
      }
      if(count == 0)System.out.println("yes");
      else System.out.println("no");
    }
}
