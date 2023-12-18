import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0;i < n;i++){
			array[i] = sc.nextInt();
		}
boolean a = true;
		for(int i = 0;i < n;i++){
			if(array[i]%2 == 0){
				if(!(array[i]%3 == 0 || array[i]%5 == 0)){
					a = false;

				}
			}
		}

		if(a){
			System.out.println("APPROVED");
		}else{
			System.out.println("DENIED");
		}

		}
}