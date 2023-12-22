import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int datanum = Integer.parseInt(sc.nextLine());
        int dataroom[][][] = new int[3][10][4];
        int b,f,r,v;
        String buf[];

        for(int i = 0; i < datanum; i++){
            buf = sc.nextLine().split(" ");
            b = Integer.parseInt(buf[0]);
            f = Integer.parseInt(buf[1]);
            r = Integer.parseInt(buf[2]);
            v = Integer.parseInt(buf[3]);
            dataroom[f-1][r-1][b-1] += v;
        }

        for(int i = 0; i < 4; i++ ){
            for(int m = 0; m < 3; m++ ){
                for(int n = 0; n < 10; n++){
                    System.out.print(" " + dataroom[m][n][i]);
                }
                System.out.println();
            }
            if( i != 3 ) System.out.println("####################");
        }
    }
}