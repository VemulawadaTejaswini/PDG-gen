import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n[] = new int[a];
		for(int i = 0; i < a; i++){
			n[i] = sc.nextInt();
		}
		int max1,max2;
		if(n[0] >= n[1]){
			max1 = n[0];
			max2 = n[1];
		}
		else{
			max1 = n[1];
			max2 = n[0];
		}
		for(int i = 2; i < a; i++){
			if(max2 < n[i]){
				if(max1 < n[i]){
					max2 = max1;
					max1 = n[i];
				}
				else{
					max2 = n[i];
				}
			}
		}
		for(int i = 0; i < a; i++){
			if(n[i] == max1){
				System.out.println(max2);

			}
			else{
				System.out.println(max1);

			}
		}

	}

}