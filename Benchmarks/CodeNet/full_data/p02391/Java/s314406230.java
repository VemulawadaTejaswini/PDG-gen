import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception{

		int a,b;
		String comp;
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();

		if(a > b){
			comp = "a > b";
		}
		else if(a == b){
			comp = "a == b";
		}
		else if(a < b){
			comp = "a < b";
		}

		System.out.println(comp);

	}
}