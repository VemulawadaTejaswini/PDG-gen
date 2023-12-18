import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
      int b = scan.nextInt();
      int k = scan.nextInt();
      if(a>=k){
        a = a-k;
      }
      else{
      	b = (a+k)%k;
        a = 0;  
      }
      System.out.println(a+" "+b);
    }
}