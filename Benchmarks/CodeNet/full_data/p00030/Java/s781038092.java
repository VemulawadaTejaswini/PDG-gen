import java.util.*;

public class Main
{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[][] countSum = new int[10][101];

	countSumFunc(0, 0, 0, countSum);
	while(sc.hasNext()){
	    int n = sc.nextInt();
	    int s = sc.nextInt();

	    if(n == 0 && s == 0){
		break;
	    }

	    System.out.println(String.valueOf(countSum[n][s]));
	}
    }

    private static void countSumFunc(int p, int num, int sum, int[][] countSum){
	if(p == 10 || sum > 100) return;
	++countSum[p][sum];

	for(int i = num; i < 10; ++i){
	    countSumFunc(p+1, i+1, sum+i, countSum);
	}
    }
}