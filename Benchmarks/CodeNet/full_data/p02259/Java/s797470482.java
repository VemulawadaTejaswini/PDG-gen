import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int i;
        int j;
        int count=0;
        for(i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        for(int k=0;k<n;k++) {
            for (j = n - 1; j > 0; j--) {

                    if(num[j]<num[j-1]) {
                        int a = num[j];
                        num[j] = num[j - 1];
                        num[j - 1] = a;
                        count=count+1;
                    }
            }
        }
        for(i=0;i<n;i++) {
            if(i==n-1) System.out.println(num[i]);
            else System.out.printf("%d ",num[i]);

        }
        System.out.println(count);
    }
}
