import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		int i,j;
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		for(i = 0; i < 3; i++){
			a[i] = sc.nextInt();
		}
		
		for(i = 0; i < 3; i++){
			for(j = i + 1; j < 3 - 1; j++){
				if(a[i] > a[j]){
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		for(i = 0; i < 3; i++){
			System.out.print(a[i]);
			if(i == 2){
				System.out.println("");
			}else{
				System.out.print(" ");
			}
		}
	}
}
			