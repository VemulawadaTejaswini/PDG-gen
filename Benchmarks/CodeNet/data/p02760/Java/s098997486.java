import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[][] n = new int[3][3];
		for(int i = 0;i < n.length; i ++){
			for(int j = 0; j < n[0].length; j ++){
				n[i][j] = sc.nextInt();
			}
		}
		int x = sc.nextInt();
		int[] num = new int[x];
		for(int i = 0; i < num.length; i++){
			num[i] = sc.nextInt();
		}
		for(int data: num){
			for(int i = 0; i < n.length; i++){
				for(int j = 0; j < n[0].length; j++){
					if(n[i][j] == data){
						n[i][j] = -1;
					}
				}
			}
		}
		for(int i = 0; i < n.length; i++){
			if(n[i][0] + n[i][1] + n[i][2] == -3){
				System.out.println("Yes");
				break;
			}
			if(n[0][i] + n[1][i] + n[2][i] == -3){
				System.out.println("Yes");
				break;
			}
			if(n[0][0] + n[1][1] + n[2][2] == -3){
				System.out.println("Yes");
				break;
			}
			if(n[2][0] + n[1][1] + n[0][2] == -3){
				System.out.println("Yes");
				break;
			}
			if(i == 2){
				System.out.println("No");
			}
		}
	}
}
