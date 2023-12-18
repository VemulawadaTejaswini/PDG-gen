import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int count = 0;
      for(char c = 'a';c <= 'z';c++){
      	for(int i = 0;i < s.length();i++){
        	if(s.charAt(i)==c)count++;
        }
        if(count%2==1){
        	System.out.println("No");
            return;
        }
        count = 0;
      }
      System.out.println("Yes");
    }
}