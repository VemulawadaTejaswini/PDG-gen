import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int k = scan.nextInt();
	int[] x = new int[n];
	for(int i = 0; i < n; i++){
	    x[i] = scan.nextInt();
	}

	int sum = 0;
	for(int i = 0; i < n; i++){
	    sum += Math.min(Math.abs(x[i]), Math.abs(x[i]-k))*2;
	}

	System.out.println(sum);
    }
}

