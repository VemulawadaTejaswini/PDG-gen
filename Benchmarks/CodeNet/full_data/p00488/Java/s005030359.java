import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int pasta[] = new int[3];
		int juice[] = new int[2];
		int i,j;
		int min = 0;//最小
		int result = 0;//最終的に-50円した値段800
		for(i = 0; i < 3; i++){
			int a = sc.nextInt();//パスタの値段を入力
			pasta[i] = a;
		}
		for(i = 0; i < 2; i++){
			int b = sc.nextInt();//ジュースの値段を入力
			juice[i] = b;
		}
		for(i = 0; i < 3; i++){
			for(j = 0; j < 2; j++){
				int sum = 0;
				sum = pasta[i] + juice[j];
				if(min == 0){
					min = sum;	
				}
				if(sum < min){
					min = sum;
				}
			}
		}
		result = result + min - 50;
		System.out.println(result);
	}

}