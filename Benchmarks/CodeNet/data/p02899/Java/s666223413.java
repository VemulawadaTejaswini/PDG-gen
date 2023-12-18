
import java.util.Arrays;
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[][] a=new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0]=in.nextInt();
            a[i][1]=i+1;
        }
        Arrays.sort(a, (b, c) -> Integer.compare(b[0], c[0]));
        for(int i=0;i<n;i++){
            System.out.print(a[i][1]+" ");
        }
        System.out.println();
    }
}
