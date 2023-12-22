import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();

                int[] a = new int[N];
                String[] abit = new String[N];

                for (int i = 0; i < N; i++) {
                	int temp = scan.nextInt();
                	String abitTemp = "";
                	for (int j = 1; j <= 32; j++) {
                		if (temp%2 == 1) {
                			abitTemp = "1" + abitTemp;
                		} else {
                			abitTemp = "0" + abitTemp;
                		}
                		temp /= 2;
                	}
                	abit[i] = abitTemp;
                }

                for (int j = 0; j < 32; j++) {

                	int guki = 0;

                	for (int i = 0; i < N; i++) {
                		if (abit[i].substring(j, j+1).equals("1")) {
                			guki++;
                		}
                	}

                	for (int i = 0; i < N; i++) {
                		if (guki%2 == 1) {
                			if (abit[i].substring(j, j+1).equals("1")) {
                				abit[i] = abit[i].substring(0, j) + "0" + abit[i].substring(j+1);
                			} else {
                				abit[i] = abit[i].substring(0, j) + "1" + abit[i].substring(j+1);
                			}
                		}
                	}

                }

                for (int i = 0; i < N; i++) {
                	System.out.print(Integer.parseInt(abit[i], 2) + " ");
                }

                System.out.println();


        }
}