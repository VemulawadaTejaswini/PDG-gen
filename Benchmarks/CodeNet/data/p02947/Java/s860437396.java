import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      char[][] s = new char[n][10];
      long count = 0;
      boolean x = true;
      for(int i = 0;i < n;i++){
        s[i] = sc.next().toCharArray();
        Arrays.sort(s[i]);
      }
      for(int i = 0;i < n;i++){
      	for(int j = 0;j < i;j++){
        	for(int k = 0;k < 10;k++){
            	if(s[i][k]!=s[j][k]){
                	x = false;
                    break;
                }
            }
            if(x)count++;
            x = true;
        }
      }
      System.out.println(count);
    }
}
