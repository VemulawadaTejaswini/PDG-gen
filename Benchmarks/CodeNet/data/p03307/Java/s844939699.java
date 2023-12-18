import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		if(b%2==0){
			System.out.println(b);
		}else {
			System.out.println(2*b);
		}

	}
}
