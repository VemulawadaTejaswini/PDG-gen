import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        extracted(n1, n2);
        input.close();
    }

	private static void extracted(int n1, int n2) {
        int count = 0;
		for(int i=n1;i<=n2;i++){
            int m1 = i / 10000;
            int m2 = i % 10;
            int m3 = i % 10000 / 1000;
            int m4 = i % 100 / 10;
            if (m1 == m2 && m3 == m4)
                count++;
        }
        System.out.println(count);
	}
}