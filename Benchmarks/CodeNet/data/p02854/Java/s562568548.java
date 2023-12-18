import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    long[] a=new long[n/2];
    long l=0,r=0;
    for(int i=0;i<n;i++) {
    	if(i<n/2) {
    		l+=sc.nextLong();
    	}else {
    		r+=sc.nextLong();
    	}
    }
    System.out.println(Math.abs(l-r));
    //System.out.println(l+" "+r);
  }
}
