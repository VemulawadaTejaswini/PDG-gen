import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int x = sc.nextInt();
			while(n != -1 || x != -1){
				int count = 0;
				for(int i = 1; i <= n; i++){
					for(int j = 1; j <= n; j++){
						if(i == j) continue;
						for(int k = 1; k <= n; k++){
							if(i == k) continue;
							if(j == k) continue;
							if(i + j + k == x){
								count++;
							}
						}
					}
				}
				count /= 6; //????????????????????????????????????
				System.out.println(count);
				n = sc.nextInt();
				x = sc.nextInt();
			}
		}
	}
}