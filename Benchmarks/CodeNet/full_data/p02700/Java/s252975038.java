import java.util.*;
class Main{
	public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
      	int a=sc.nextInt();
      	int b=sc.nextInt();
      	int c=sc.nextInt();
      	int d=sc.nextInt();
      	int c1=0;
      	int c2=0;
      	while(c!=0){
        	c=(int )Math.abs(c-b);
          	c1++;
        }
      	while(a!=0){
          a=(int)Math.abs(a-d);
          c2++;
        }
      if(c1<=c2){
      System.out.println("Yes");
      }else{
            System.out.println("No");
      }
    }
}
