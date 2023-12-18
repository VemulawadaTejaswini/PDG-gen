import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int a = (int)(A/0.08);
        if((int)(a*0.1) == B){
          System.out.println(a);
        }else{
          System.out.println(-1);
        }
	}
}