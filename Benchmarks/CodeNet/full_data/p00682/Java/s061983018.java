import java.util.Scanner;

class Main {
    
    public static void main(String[] args){
	final int X = 0;
	final int Y = 1;
	int p[][] = new int[50][2];
	int times = 1;
	Scanner stdin = new Scanner(System.in);
	while(true){
	    int n = stdin.nextInt();
	    if(n == 0){
		break;
	    }
	    for(int i = 0; i < n; i++){
		p[i][X] = stdin.nextInt();
		p[i][Y] = stdin.nextInt();
	    }
	    double answer = 0;
	    for(int i = 0; i < n - 1; i++){
		answer += (double)(p[i + 1][X] - p[i][X]) * (p[i][Y] + p[i + 1][Y]) / 2;
	    }
	    answer += (double)(p[0][X] - p[n - 1][X]) * (p[n - 1][Y] + p[0][Y]) / 2;
	    System.out.printf("%d %.1f\n", times, answer);
	    times++;
	}
    }
}