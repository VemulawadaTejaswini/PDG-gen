import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int num[][] = new int [n][3];
		int ten[] = new int [n];
		int cnt = 0;
		for(int i = 0; i < n; i++){
			for(int k = 0; k < 3; k++){
				num[i][k] = sc.nextInt();//num?????\???
			}
			ten[i] = 0;//ten????????????
		}
		for(int i = 0; i < 3; i++){
			for(int k = 0; k < n; k++){
				cnt = 0;
				for(int j = 0; j < n; j++){
					if(num[k][i] == num[j][i] && k != j) cnt++;
				}
				if(cnt == 0) ten[k] += num[k][i];
			}
		}
		for(int i = 0; i < ten.length; i++){
			System.out.println(ten[i]);
		}
	}
}