import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    long b=sc.nextLong(),n=sc.nextLong(),max=0;
    long f=0;
    if(a<b) {
	    if(n>=b) {
	    	System.out.println(a-1);
	    }else {
		    for(int i=1;i<=Math.min(a, n);i++) {
		    	f=(a*i)/b-a*(i/b);
		    	max=Math.max(f, max);
		    	//System.out.println("i: "+i+" f:"+f);
		    	//System.out.println((a*i)/b+" "+(a*(i/b)));
		    }
		    System.out.println(max);
	    }
    }else {
	    if(n>=b) {
	    	System.out.println(b-1);
	    }else {
		    for(int i=1;i<=Math.min(b, n);i++) {
		    	f=(a*i)/b-a*(i/b);
		    	max=Math.max(f, max);
		    	//System.out.println("i: "+i+" f:"+f);
		    	//System.out.println((a*i)/b+" "+(a*(i/b)));
		    }
		    System.out.println(max);
	    }
    }
  }
}
