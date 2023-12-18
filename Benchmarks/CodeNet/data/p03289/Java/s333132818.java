import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s=sc.next();
		if(s.matches("A[a-z]{1}C[a-z]*[a-z]{2}")){
			System.out.println("AC");
		}else{
			System.out.println("WA");
		}


	}
}
