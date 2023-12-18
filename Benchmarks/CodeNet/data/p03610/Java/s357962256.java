import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      char[] str = sc.next().toCharArray();
      int n = 0;
      while(n < str.length){
      	System.out.print(str[n]);
        n += 2;
      }
    }
}