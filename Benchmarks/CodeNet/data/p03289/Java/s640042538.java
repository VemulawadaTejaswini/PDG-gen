import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s=sc.next();
		if(s.matches("A[a-z]{1}[a-z]*C[a-z]*[a-z]{1}")){
			System.out.println("AC");
		}else{
			System.out.println("WA");
		}


	}
}
