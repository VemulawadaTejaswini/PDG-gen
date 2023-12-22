public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = 0, b = 0, men = 0, shu = 0;
		try{
			a = Integer.valueOf(input.next());
			b = Integer.valueOf(input.next());
		}catch(Exception e){
			System.out.println("hb");
		}
		men = a * b;
		shu = a*2 + b*2;
		System.out.println(men + " " + shu);
	}
}