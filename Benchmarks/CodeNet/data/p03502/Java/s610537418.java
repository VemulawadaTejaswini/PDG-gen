import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    char[]n = N.toCharArray();
    
    int all = 0;
    for(int i=0; i<N.length(); i++) {
    	all += n[i]-48;
    }
    if(Integer.valueOf(N)%all==0) {   		
		System.out.println("YES");
    }else {
    	System.out.println("NO");
    }
    }
}
