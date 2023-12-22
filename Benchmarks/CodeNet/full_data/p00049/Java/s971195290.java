import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//initialization
		int A  = 0,
            B  = 0,
            AB = 0,
            O  = 0;

        //input
		String blood;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	blood = sc.nextLine().split(",")[1];

        	if(blood.equals("A")) {A++; }
        	if(blood.equals("B")) {B++; }
        	if(blood.equals("AB")){AB++;}
        	if(blood.equals("O")) {O++; }
        }
        System.out.println(A);
        System.out.println(B);
        System.out.println(AB);
        System.out.println(O);
	}
}