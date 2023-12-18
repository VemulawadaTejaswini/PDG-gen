import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int k = sc.nextInt();
      for(int i = 0;i < k;i+=2){
      	if(a%2==0){
          b = b+a/2;
          a/=2;
        }
        else{
          a--;
          b = b+a/2;
          a/=2;
        }
        if(b%2==0){
          a = a+b/2;
          b/=2;
        }
        else{
          b--;
          a = a+b/2;
          b/=2;
        }
      }
      if(k%2==1)b=b+a/2;
      System.out.println(a+" "+b);
    }
}
