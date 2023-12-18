import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int hi = 0;


		if (A <= B) {
			hi+=A;
		}
		else{
			hi+=B;
		}
		if (C <= D){
			hi+=C;
		}
		else{ 
			hi+=D;
		}

		System.out.println(hi);
	}

}
