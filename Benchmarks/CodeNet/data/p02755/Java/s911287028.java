import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int a,b,c=0;
  	a=sc.nextInt();
  	b=sc.nextInt();
  	for(int i=1;i<=1009;i++){
      if((int)(i*0.08)==a&&(int)(i*0.1)==b){
        c=i;
        break;
      }
    }
  	System.out.print(c);
  }
}