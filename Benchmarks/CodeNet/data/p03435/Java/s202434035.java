import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                a[i][j] = sc.nextInt();
        int _1 = a[0][1]+a[0][2]+a[1][2];
        int _2 = a[1][0]+a[2][0]+a[2][1];
        int _3 = a[0][0]+a[1][1]+a[2][2];
        if(_1+_2==2*_3) {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}