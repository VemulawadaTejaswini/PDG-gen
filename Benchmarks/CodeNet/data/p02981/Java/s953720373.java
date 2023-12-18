import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
      
        int NA = N * A;
      
        if(NA < B){
          System.out.println(NA);
        }else{
          System.out.println(B);
        }
	}

}