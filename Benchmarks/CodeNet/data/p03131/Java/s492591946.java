import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long k=sc.nextLong(),a=sc.nextLong(),b=sc.nextLong();
    if((b-a)<=2 || k==1) {
    	System.out.println(k+1);
    }else {
    	long flag=(k-a+1)/2;
    	if(flag>0)System.out.println(flag*(b/a));
    	else System.out.println(k+1);
    }
  }
}
