import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int i;
		int z=0;
		
		for(i=a;i<=b;i++){
			if(c%i==0){
				z++;
			}
			
		}
		System.out.println(z);

	}

}

