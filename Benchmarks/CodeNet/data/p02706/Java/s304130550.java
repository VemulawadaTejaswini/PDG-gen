import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int M = sc.nextInt();
        int i;
	    for(i = 0; i < M; i++){
	      N -= sc.nextInt();
	    }
	    if(N<0){
	      System.out.println(-1);
	    } else {
	      System.out.println(N);
	    }
	}
}
