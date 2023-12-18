import java.util.Scanner;
 
class Main {
	int n;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}
	Main(Scanner sc){
		n = sc.nextInt();
	}
	void solve(){
		int min = Integer.MAX_VALUE;
		int sum;
		int i;
		for(int a=1;a<n;a++){
			sum = 0;
			i = a;
			while(i>0){
				sum += i%10;
				i /= 10;
			}
			i = n-a;
			while(i>0){
				sum += i%10;
				i /= 10;
			}
			min = Math.min(min, sum);
		}
		System.out.println(min);
	}
}