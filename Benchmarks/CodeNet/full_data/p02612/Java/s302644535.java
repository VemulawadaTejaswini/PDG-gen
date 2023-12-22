public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var a = sc.nextInt();
		for(int i=0;i<=10;i++) {
			if(a<=i*1000) {
				System.out.println(i*1000-a);
				break;
			}
		}
	}
}
