import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int antenas[] = new int[5], k, dif=0, diff=0, cont=0;
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			antenas[i] = scanner.nextInt();
		}
		k = scanner.nextInt();
		for(int i = 0; i < antenas.length-1; i++) {
			dif = antenas[i] - antenas [0];
			if(dif > k || diff > k) {
				cont++;
			}
			dif = antenas[i] - antenas [1];
			if(dif > k || diff > k) {
				cont++;
			}
			dif = antenas[i] - antenas [2];
			if(dif > k || diff > k) {
				cont++;
			}
			dif = antenas[i] - antenas [3];
			if(dif > k || diff > k) {
				cont++;
			}
			dif = antenas[i] - antenas [4];
			if(dif > k || diff > k) {
				cont++;
			}
		}
		
		if(cont != 0) {
			System.out.println(": (\n");	
		}else
			System.out.println("Yay!\n");	
	}
}
