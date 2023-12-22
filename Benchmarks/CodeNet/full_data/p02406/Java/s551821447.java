import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		for(i=1;i<=n;i++){
			if(i % 3 == 0){
				System.out.printf(" %d",i);
			}else{
				include(i);
			}
		}
		System.out.println();
	}

	static void include(int n){
		int x;
		if(n%10 == 3){
			System.out.printf(" %d",n);
		}
		x = n / 10;
		if(x >= 10){
			include(x);
		}
	}

}