import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int r=sc.nextInt(),g=sc.nextInt(),b=sc.nextInt(),n=sc.nextInt(),count=0;
    for(int i=0;i<=n;i++) {
    	for(int j=0;j<=n-i;j++) {
    		if((n-(i*r+j*g))%b==0 && n-(i*r+j*g)>=0)count++;
    		//System.out.print(n-(i*r+j*g)+" ");
    	}
    }
    System.out.println(count);
  }
}
