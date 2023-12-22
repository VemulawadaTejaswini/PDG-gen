import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int i = 1;

        while(A > 0 && C >0) {
        	if(i % 2 != 0) {
        		C = C - B;
        	} else {
        		A = A - D;
        	}
        	i++;
        }

        if(C <= 0) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
    }
}