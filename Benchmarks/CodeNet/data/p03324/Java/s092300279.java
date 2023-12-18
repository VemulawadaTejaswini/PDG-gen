import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int D = sc.nextInt();
	int N = sc.nextInt();
	if(D == 0){
	    if(N==100) System.out.print(101);
	    else System.out.print(N);
	}else{
	    System.out.print((int)Math.pow(100,D) * N);
	}
    }
}
