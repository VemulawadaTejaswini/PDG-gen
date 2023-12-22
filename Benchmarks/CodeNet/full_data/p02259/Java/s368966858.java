import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            int x[] = new int[n];
            int i,j,c=0,tmp;
            for(i=0;i<n;i++) x[i]=sc.nextInt();
            for(j=n;j>1;j--) {
                for (i = 0; i < j - 1; i++) {
                    if (x[i] > x[i + 1]) {
                        tmp = x[i];
                        x[i] = x[i + 1];
                        x[i + 1] = tmp;
                        c++;
                    }
                }
            }
            for(i=0;i<n;i++) System.out.printf(x[i]+" ");
            System.out.printf("\n"+c);
        }
    }
}

