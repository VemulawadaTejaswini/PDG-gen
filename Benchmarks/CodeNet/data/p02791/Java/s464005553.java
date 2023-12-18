import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
        int count = 1;
	int min = sc.nextInt();
	int P = 0;
	for(int i=2;i<=N;i++){
	    P = sc.nextInt();
	    if(P <= min){
		count++;
		min = P;
	    }
	}
	System.out.print(count);
    }
}