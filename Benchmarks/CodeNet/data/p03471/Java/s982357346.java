import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = sc.nextInt() / 1000;
		for(int i = 0; i <= y/10;i++){
			for(int j =0; j <= y/5;j++){
				for(int k = 0;k <= y; k++){
					if(i+j+k == n){
						if((i *10) + (j * 5) + k == y){
							System.out.println(i + " " + j +" " + k);
							return;
						}
					}else if(i+j+k > n) break;
				}
			}
		}
		System.out.println("-1 -1 -1");
	}
}