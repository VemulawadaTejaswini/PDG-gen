import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();
		for(int i=0;i<q;i++){
			int l = scanner.nextInt(), r = scanner.nextInt();
			int count = 0;
			for(int j=l;j<=r;j+=2){
				if(checkSosu(j)){
					if(checkSosu((j+1) / 2)){
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}

	public static boolean checkSosu(int num){
		for(int i=2;i<num;i++){
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}

}
