import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[q];
        int[] b = new int[q];
        int[] c = new int[q];
        int[] d = new int[q];
        for (int i = 0 ; i < q ; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        int min = 0;
        for (int a1 = 1 ; a1 <= m ; a1++) {
            for (int a2 = a1 ; a2 <= m ; a2++) {
                for (int a3 = a2 ; a3 <= m ; a3++) {
                    for (int a4 = a3 ; a4 <= m ; a4++) {
                        for (int a5 = a4 ; a5 <= m ; a5++) {
                            for (int a6 = a5 ; a6 <= m ; a6++) {
                                for (int a7 = a6 ; a7 <= m ; a7++) {
                                    for (int a8 = a7 ; a8 <= m ; a8++) {
                                        for (int a9 = a8 ; a9 <= m ; a9++) {
                                            for (int a10 = a9 ; a10 <= m ; a10++) {
                                                int sum = 0;
                                                int[] t = new int[] {a1, a2, a3, a4, a5, a6, a7 ,a8, a9 ,a10};
                                                for (int i = 0 ; i < q ; i++) {
                                                    if (t[b[i] - 1] - t[a[i] - 1] == c[i]) sum += d[i];
                                                }
                                                min = Math.max(sum, min);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(min);
    }

}
