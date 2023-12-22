import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			int[][] d = new int[n][4];
			for(int i=0;i<n;i++){
				for(int j=0;j<4;j++){
					d[i][j] = stdIn.nextInt();
				}
			}
			// sort
			for(int i=0;i<n;i++){
				int min = i;
				for(int j=i+1;j<n;j++){
					if(d[min][2]>d[j][2]){
						min = j;
					}
					else if(d[min][2]==d[j][2]&&d[min][3]<d[j][3]){
						min = j;
					}
				}
				int tmp = d[i][2];
				d[i][2] = d[min][2];
				d[min][2] = tmp;
			}
			int pass = 0;
			for(int i=0;i<n;i++){
				if(pass<10){
					int my = 0;
					for(int j=0;j<i;j++){
						if(d[i][1]==d[j][1]){
							my++;
						}
					}
					if(my<3){
						pass++;
						System.out.println(d[i][0]);
					}
				}
				else if(pass<20){
					int my = 0;
					for(int j=0;j<i;j++){
						if(d[i][1]==d[j][1]){
							my++;
						}
					}
					if(my<2){
						pass++;
						System.out.println(d[i][0]);
					}
				}
				else if(pass<26){
					int my = 0;
					for(int j=0;j<i;j++){
						if(d[i][1]==d[j][1]){
							my++;
						}
					}
					if(my==0){
						pass++;
						System.out.println(d[i][0]);
					}
				}
			}
		}
	}
}