import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time[] = new int[5];
		int itiKeta;
		int minItiKeta = Integer.MAX_VALUE;
		int minItiKetaTime = 0;
		int answer = 0;

		for (int i = 0; i < 5; i++) {
			time[i] = sc.nextInt();
			itiKeta = Character.getNumericValue(String.valueOf(time[i]).charAt(String.valueOf(time[i]).length() - 1));
			if (itiKeta == 0) continue;
			minItiKeta = Math.min(minItiKeta, itiKeta);
			if (itiKeta == minItiKeta) minItiKetaTime = i;
		}

		for (int i = 0; i < 5; i++) {
			if (i != minItiKetaTime) answer += Math.ceil((double)time[i] / 10) * 10;
		}

		System.out.println(answer + time[minItiKetaTime]);
	}
}
