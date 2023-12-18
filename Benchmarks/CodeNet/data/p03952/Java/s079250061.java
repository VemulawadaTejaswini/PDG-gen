import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int x = sc.nextInt();
		sc.close();
		
		if(x == 1 || x == n*2-1){
			System.out.println("No");
		}else{
			System.out.println("Yes");
			for(int i=n; i<n*2; i++){
				if(i!=x){
					System.out.println(i);
				}
			}
			System.out.println(x);
			for(int i=1; i<n; i++){
				if(i!=x){
					System.out.println(i);
				}
			}
		}
	}

}