import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      char[] s = sc.next().toCharArray();
      int count = 0;
      int max = 0;
      boolean left = false;
      boolean right = false;
      for(int i = 0;i < n;i++){
        count = 0;
      	for(char x = 'a';x <= 'z';x++){
      		for(int j = 0;j < i;j++){
            	if(s[j]==x) left = true;
            }
            for(int j = i;j < n;j++){
            	if(s[j]==x) right = true;
            }
          if(left&&right)count++;
      	}
        max = Math.max(max,count);
      }
      System.out.println(max);
    }
}