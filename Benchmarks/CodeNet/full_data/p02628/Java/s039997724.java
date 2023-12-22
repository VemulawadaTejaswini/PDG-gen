import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, k,i,tmp,j,sum=0;

        n = sc.nextInt();
        k = sc.nextInt();

        int p[] = new int[n];

        for (i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (p[i] > p[j]) {
                    tmp = p[i];
                    p[i] = p[j];
                    p[j] = tmp;
                }
            }
        }
        for (i = 0; i < k; i++) {
            sum += p[i];
        }
        System.out.println(sum);
    }

}