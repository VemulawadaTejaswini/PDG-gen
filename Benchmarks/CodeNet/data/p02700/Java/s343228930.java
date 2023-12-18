import java.util.*;


public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		while(true) {
		    //高橋君の体力
		    C -= B;
		    if(C<=0) {
		        System.out.println("Yes");
		        break;
		    }
		    //青木君の体力
		    A -= D;
		    if(A<=0){
		        System.out.println("No");
		        break;
		    }
		}
		    
		    
    }
}