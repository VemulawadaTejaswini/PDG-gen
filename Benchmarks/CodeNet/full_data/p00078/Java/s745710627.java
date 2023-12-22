import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
        	int n = scan.nextInt();
        	if(n == 0){
        		break;
        	}
        	int[][] sq = new int[n][n];
        	int a = 2;
        	int x = n/2 + 1;
        	int y = n/2;
        	sq[x][y] = 1;
        	while(a <= n*n){
        		while(true){
        			x = (x == n-1)?0:x+1;
        			y = (y == n-1)?0:y+1;
        			if(sq[x][y] == 0){
        				sq[x][y] = a;
        				break;
        			}else{
        				x = (x == n-1)?0:x+1;
        				y = (y == 0)?n-1:y-1;
        				sq[x][y] = a;
        				break;
        			}
        		}
        		a++;
        	}
        	for(int i = 0;i < n;i++){
        		for(int j = 0;j < n;j++){
        			System.out.printf("%4d",sq[i][j]);
        		}
        		System.out.println();
        	}
        }
    }
}