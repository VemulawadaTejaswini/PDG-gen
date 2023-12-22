import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] a=new boolean[2][sc.nextInt()];
        for(int i=0;i<2;i++) {
            for(int j=sc.nextInt();j>0;j--)
            a[i][sc.nextInt()-1]=true;
        }
        int count=0;
        for(int i=sc.nextInt();i>0;i--) {
            int t=sc.nextInt()-1;
            if(!a[0][t]||a[1][t]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
