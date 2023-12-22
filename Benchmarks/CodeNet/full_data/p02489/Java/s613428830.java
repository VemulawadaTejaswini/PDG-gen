public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b =1;
		while(sc.hasNext()){
			int a = sc.nextInt();
			System.out.println("Case "+ b+": "+ a);
			b++;
		}
	}
}