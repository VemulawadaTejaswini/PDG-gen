import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A=sc.nextInt();
    int V=sc.nextInt();
    int B=sc.nextInt();
    int W=sc.nextInt();
    int T=sc.nextInt();
    int X=Math.abs(B-A);
    int sp=V-W;
    int Z=sp*T-X;
    
    for(int i=0; i<T; i++) {
    	if(X==0) {
    	}else {
    		X=Math.abs(X-sp);
    	}
    	}
    if(X==0) {
    	System.out.println("YES");
    }else {
    	System.out.println("NO");
    }
    }
}