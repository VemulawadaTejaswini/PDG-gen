import java.util.*;
class Solution{
	public static void main(String args[]){
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt();
      	int a = n % 10;
      	int b = (n / 10) % 10;
      	int c = (n / 100) % 10;
      	if(a == 7 || b == 7 || c == 7){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
    }
}