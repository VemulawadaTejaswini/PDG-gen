import java.util.Scanner;

public class Main{

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int i, j, k;
	int count = 0;

	while(true){
	    int n = sc.nextInt();
	    int x = sc.nextInt();
	    if(n == 0 && x == 0 || n < 3 || n > 100){
	    break;
	    }

	    for(i = 1; i <= n - 2; i++){
		for(j = i + 1; j <= n - 1; j++){
		    for(k = j + 1; k <= n; k++){
			if(i + j + k == x){
			    count++;
			}
		    }
		}
	    }
	    System.out.printf("%d\n", count);
	}
    }
}