import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] building1 = new int[3][10];
        int[][] building2 = new int[3][10];
        int[][] building3 = new int[3][10];
        int[][] building4 = new int[3][10];

        for(int i=0;i<n;i++){
            int b = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int v = sc.nextInt();

            switch(b){
                case 1:
                    building1[f-1][r-1] += v;
                    break;
                case 2:
                    building2[f-1][r-1] += v;
                    break;
                case 3:
                    building3[f-1][r-1] += v;
                    break;
                case 4:
                    building4[f-1][r-1] += v;
                    break;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<10;j++){
                System.out.print(" " + building1[i][j]);
            }
            System.out.println();
        }
        System.out.println("####################");
        for(int i=0;i<3;i++){
            for(int j=0;j<10;j++){
                System.out.print(" " + building2[i][j]);
            }
            System.out.println();
        }
        System.out.println("####################");        
        for(int i=0;i<3;i++){
            for(int j=0;j<10;j++){
                System.out.print(" " + building3[i][j]);
            }
            System.out.println();
        }
        System.out.println("####################");
        for(int i=0;i<3;i++){
            for(int j=0;j<10;j++){
                System.out.print(" " + building4[i][j]);
            }
            System.out.println();
        }
    }
}
