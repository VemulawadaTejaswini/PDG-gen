import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	String s = scan.next();
      	int some = roundup(s.length());
      	char[] ans = new char[some];
      	int counter = 0;
      	for (int i = 0; i <= some + 2; i = i + 2){
       		ans[counter] = s.charAt(i);
          	counter++ ;
        }
      	System.out.print(ans);
    }
  	public static int roundup(int x){
      	int ans = 0;
      	if(x % 2 == 0){
        	ans = x / 2;
        }
      	else{
        	ans = x / 2 + 1; 
        }
      	return ans;
    }
}