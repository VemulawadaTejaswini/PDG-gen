import java.util.Scanner;

public class Main {

	private void doit() {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			int [] data = new int[7];
			while(n-- > 0){
				int now = sc.nextInt();
				if(now < 10){
					data[0]++;
				}
				else if(now > 59){
					data[6]++;
				}
				else{
					data[now / 10]++;
				}
			}
			for(int s: data){
				System.out.println(s);
			}
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}