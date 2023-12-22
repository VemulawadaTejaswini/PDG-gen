import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter(",");
        int i, j, k;
        int[] a = new int[100];
        int[] b = new int[100];
        int[] c = new int[100];
        int[] d = new int[100];
        int w = sc.nextInt();
        int n = sc.nextInt();
        for(i = 0; i < w; i++){
            c[i] = i + 1;
        }
        for(j = 0; j < n; j++){
            a[j] = sc.nextInt();
            b[j] = sc.nextInt();
            d[j] = c[a[j] - 1];
            c[a[j] - 1] = c[b[j] - 1];
            c[b[j] - 1] = d[j];
        }
        for(k = 0; k < w; k++){
            System.out.println(c[k]);
        }
    }
}
