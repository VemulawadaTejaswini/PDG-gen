import java.util.*;

class Main{
	public static void main(String args []){
    Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int k = scan.nextInt();
      int [] ss = new int[10];
      while(k-->0)ss[scan.nextInt()]++;
      for(int i=1;i<10000;i++){
      	int x = i;
        while(x>0&& i>=n){
        	int rem = x%10;
          	if(ss[rem]!=0){
            	break;
            }
          	x=x/10;
        }
        if(x==0){
        	System.out.println(i);
          return;
        }
      }
      
    }
}