import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int a=sc.nextInt();
  	int b=sc.nextInt();
  	int c=sc.nextInt();
  	int d=sc.nextInt();
  	int f=0;
  	while(f==0){
  		c-=b;
  		if(c<=0){
  			System.out.print("Yes");
  			break;
  		}
  		a-=d;
  		if(a<=0){
  			System.out.print("No");
  			break;
  		}
  	}
  }
}