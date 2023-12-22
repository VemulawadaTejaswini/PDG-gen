import java.util.Scanner;
public class hima{
	int a;
	public void input(){
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
	}
	public void output(){
		System.out.println(a*a*a);
	}
	public static void main(String[] args){
		hima p = new hima();
		p.input();
		p.output();
	}
}