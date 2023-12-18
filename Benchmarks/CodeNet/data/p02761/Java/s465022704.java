import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int array[] = new int [n];

		for(int i = 0;i<n;i++){
			array[i] = 0;
		}

		for(int i = 0;i<m;i++){
			int ind = sc.nextInt()-1;
			int tmp = sc.nextInt();
			if(array[ind] == 0){
				array[ind] = tmp;
			}else{
				array[ind] = Math.min(array[ind], tmp);
			}
		}

		if(array[0] == 0){
			System.out.println("-1");
		}else{
			for(int i = 0;i<n;i++){
				System.out.print(array[i]);
			}
		}
	}
}