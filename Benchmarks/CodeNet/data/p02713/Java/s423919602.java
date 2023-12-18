import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		sc.close();

		int sum = 0;
		for(int a=1; a<=K; a++){
			for(int b=1; b<=K; b++){
				for(int c=1; c<=K; c++){
					int x = getGCD(getGCD(a, b), c);
					//System.out.printf("%d %d %d %d\n", a, b, c, x);
					sum += x;
				}
			}
		}
		
		System.out.printf("%d\n", sum);
	}

	public static int getGCD(int a, int b){
		int[] numArray = {a, b};
		int x;
        int y;
        if (numArray[0] > numArray[1]) {
            x = numArray[0];
            y = numArray[1];
        } else {
            x = numArray[1];
            y = numArray[0];
        }

        // ここからがユークリッドの互除法を用いた最大公約数を
        // 求める為の式
        int tmp;
        while ((tmp = x % y) != 0) {
            x = y;
            y = tmp;
		}

		return y;
	}

}