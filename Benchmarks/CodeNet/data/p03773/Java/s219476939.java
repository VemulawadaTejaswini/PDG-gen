public class Main{
	public static void main(String[] args){
		int a, b,time;
		Scanner sc = new Scanner();

		a = sc.nextInt();
		b = sc.nextInt();

		time = (a+b) % 24;
		System.out.println(time);
	}
}

	
