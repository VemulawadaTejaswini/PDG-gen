import java.util.Scanner;

public class Main{
    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	int  num[];
	int temp;
	int i, j;

	    int N = sc.nextInt();
	    num = new int[N];

	    for(i = 0; i < N; i++){
		num[i] = sc.nextInt();
	    }

	    for(j = 0; j < N - 1; j++)
	    for(i = N - 1; i > j; i--){
		if(num[i - 1] > num[i]){
		    temp = num[i];
		    num[i] = num[i - 1];
		    num[i - 1] = temp;
		}
	    }

	    for(j = 0; j < N; j++){
		System.out.printf("%d ", num[j]);
	    }
	    System.out.printf("\n");
    }
}