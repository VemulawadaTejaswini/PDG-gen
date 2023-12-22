
public class Main {
	public static void main(String[] args){
		int a;		//??????
		int b;		//??????
		int area;
		int circuit;
		
		a = new java.util.Scanner(System.in).nextInt();
		b = new java.util.Scanner(System.in).nextInt();
		area = a*b;
		circuit = (2*a) + (2*b);
		System.out.println(area+" "+circuit);
	}
}