import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k =  sc.nextInt();
		int[] list = new int[n];
		double maxKitaichi = 0;
		for(int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
		}
		double totalKitaichi = 0;
		for(int i =0; i < (n-k +1);i++) {
			totalKitaichi = getTotalKitaichi(list,i,k);
			if(totalKitaichi > maxKitaichi) {
				maxKitaichi = totalKitaichi;
			}
		}
		System.out.println(maxKitaichi);

	}

	private static double getTotalKitaichi(int[] list, int i, int k) {
		double totalKitaichi = 0;
		for(int j = i; j < i + k; j++) {
			totalKitaichi += getKitaichi(list[j]);
		}
		return totalKitaichi;
	}

	private static double getKitaichi(int number) {
		return ((1 + number) * number * 0.5) / number;
	}
}