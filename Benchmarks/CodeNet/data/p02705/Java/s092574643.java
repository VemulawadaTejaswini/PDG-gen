import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	         int n = sc.nextInt();
      		 int m = sc.nextInt();
      		 int a =0;
        for(int i=0; i<m; i++){
           a += sc.nextInt();
        }
      if(n>=a){
      System.out.println(n-a);
      }else
        System.out.println('-1');
    }
    }
}