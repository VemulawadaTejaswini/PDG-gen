import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int[] l = new int[8];
            for(int i=0;i<8;i++) {
                l[i]=sc.nextInt();
            }
            int v = 0;
            int min = 999;
            int[] c = { 1, 2, 1, 2, 1, 4, 1, 4 };
            for (int i = 0; i < 8; i++) {
                int sum=0;
                for (int j = 0; j < 8; j++) {
                    int d=l[j] - c[(i + j) % 8];
                    sum += d>0?d:0;
                }
                if (min > sum) {
                    min = sum;
                    v = i;
                }
            }
//            for (int i = v; i < 8 + v; i++) {
//                System.out.print(c[i % 8] + (i != 7 + v ? " " : "\n"));
//            }
            for(int i=0;i<7;i++) {
                System.out.print(c[(i+v)%8]+" ");
            }
            System.out.println(c[(7+v)%8]);
        }
    }
}
