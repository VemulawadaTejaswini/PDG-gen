public class Main{
	public static void main(String [] args) {
		Scanner sn=new Scanner(System.in);
		int x=sn.nextInt();
		if(x>0||x<100) {
			System.out.println(x*x*x);
		}
	}
}