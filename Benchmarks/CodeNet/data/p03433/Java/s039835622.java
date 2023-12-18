import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
            for(int j=0;j<n-i-1;j++)
                if(a[j]<a[j+1]) {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
        int sum1 = 0;
        int sum2 = 0;
        int flag = 1;
        for(int i=0;i<n;i++,flag*=-1) {
            if(flag==1) {
                sum1+=a[i];
            }
            else sum2+=a[i];
        }
        System.out.println(sum1-sum2);
    }
}