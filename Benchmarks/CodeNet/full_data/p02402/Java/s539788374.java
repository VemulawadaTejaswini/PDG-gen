import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        int n,i,j,temp;
        long sum;
        int[] a;
        sum = 0;
        str = scan.nextLine();
        n = Integer.valueOf(str);
        a = new int[n];
        str = scan.nextLine();
        String[] num = str.split(" ", 0);
        for(i=0;i<n;i++){
            a[i] = Integer.valueOf(num[i]);
            sum += a[i];
        }
        for(i=0;i<n;i++){
            for(j=n-1;j>i;j--){
                if(a[j]<a[j-1]){
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
        System.out.println(a[0]+" "+a[n-1]+" "+sum);
        scan.close();
    }
}
