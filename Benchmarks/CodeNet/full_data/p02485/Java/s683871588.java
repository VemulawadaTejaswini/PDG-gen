public class Main {

	public static void main(String[] args) {
		while (true){
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int a,sum=0;
			while(true){
				a = n%10;
				sum += a;
				n = n/10;
				System.out.println(sum);
				if(n < 1)break;
			}	
		}
	}
}