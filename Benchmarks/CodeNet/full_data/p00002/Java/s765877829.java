import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int num = sc.nextInt() + sc. nextInt();
			int d = 1;
			while(num >= tene(d)){
				d++;
			}
			
			System.out.println(d);
		}
	}

	private static int tene(int digit){
		int t = 1;
		
		for(int i = 0; i < digit; i++){
			t=t*10;
		}
		
		return t;
	}
}