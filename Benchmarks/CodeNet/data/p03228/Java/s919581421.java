import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a=sc.nextLong(),b=sc.nextLong();
    int k=sc.nextInt();
    for(int i=0;i<k;i++) {
    	if(i%2==0) {
	    	if(a%2!=0)a--;
			a=a/2;
			b+=a;
    	}else {
			if(b%2!=0)b--;
			b=b/2;
			a+=b;
    	}
    }
    System.out.println(a+" "+b);
  }
}
