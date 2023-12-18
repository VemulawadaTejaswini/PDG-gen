import java.util.Scanner;

public class RegistroDeNome {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int N, cont = 1;
		 
		 N = sc.nextInt();
		 
		 while (true) {
			 if (cont % 2 == 0 && cont % N == 0)
				 break;
			 
			 cont++;
		 }
		 
		 System.out.println(cont);

	}

}
