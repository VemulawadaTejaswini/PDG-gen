import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int antenas[] = new int[5], k, dif=0, diff=0, cont=0;
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			antenas[i] = scanner.nextInt();
		}
		k = scanner.nextInt();
		int j = antenas.length-1;
		for(int i = 0; i < antenas.length-1; i++) {
			dif = antenas[j]-antenas[i];
			diff = antenas[i+1] - antenas [i];
			j--;
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