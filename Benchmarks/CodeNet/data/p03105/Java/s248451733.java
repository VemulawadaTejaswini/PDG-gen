import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int qTem, qNece, qQuer, cont=0;
		Scanner scanner = new Scanner (System.in);
		qTem = scanner.nextInt();
		qNece = scanner.nextInt();
		qQuer = scanner.nextInt();
		
		while(qNece > qTem) {
			qNece -= qTem;
			cont++;
		}
		if(cont <= qQuer) {
			System.out.println(cont+1);
		}else if(cont == 0){
			System.out.println("0\n");
		}else if(cont > qQuer) {
			System.out.println(qQuer);
		}
	}
}