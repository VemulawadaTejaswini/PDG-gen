public class Main {
	public static void main (String[] args){
		int i=1;
		int a=1;
		while(a != 0){
			Scanner in = new Scanner(System.in);
			a = in.nextInt();
			System.out.println("Case "+i+": "+a);
			i++;
		}
	}
}