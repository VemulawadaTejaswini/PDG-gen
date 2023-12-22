import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int outA = sc.nextInt();
      	int outB = sc.nextInt();
        int outC = sc.nextInt();
        int outD = sc.nextInt();
      	
      	if (outB >= 0) {
      		   if (outD > 0)  {
                System.out.println(outB * outD);
               } else {
                System.out.println(outA * outD);
               }  
        } else if (outB == 0 && outD == 0) {
        	System.out.println(outA * outC);
        } else {
        		if (outD >= 0) {
                 System.out.println(outA * outC);
                } else {
                  outB = outB * -1;
                  outD = outD * -1;
                 System.out.println(outB * outD);
                }
        }
	}
}