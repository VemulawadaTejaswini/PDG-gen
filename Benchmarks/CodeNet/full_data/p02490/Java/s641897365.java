import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    while(true){
    	int a=s.nextInt(),b=s.nextInt();
    	if(a==0 && b==0) break;
    	System.out.printf("%d %d\n",(a>b)?b:a,(a>b)?a:b);
    }
  }
}