import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int[][] rooms_1 = new int[3][10];
        for (int a = 0; a < 3; a ++){
            for (int b = 0; b < 10; b ++)
                rooms_1[a][b] = 0;
        }
        int[][] rooms_2 = new int[3][10];
        for (int a = 0; a < 3; a ++){
            for (int b = 0; b < 10; b ++)
                rooms_2[a][b] = 0;
        }
        int[][] rooms_3 = new int[3][10];
        for (int a = 0; a < 3; a ++){
            for (int b = 0; b < 10; b ++)
                rooms_3[a][b] = 0;
        }
        int[][] rooms_4 = new int[3][10];
        for (int a = 0; a < 3; a ++){
            for (int b = 0; b < 10; b ++)
                rooms_4[a][b] = 0;
        }
        int cnt = input.nextInt();
        int unit = 0;
        int floor = 0;
        int room = 0;
        int number = 0;
        for(int i = 0; i < cnt; i ++){
            unit = input.nextInt();
            floor = input.nextInt();
            room = input.nextInt();
            number = input.nextInt();
            deal(unit, floor, room, number, rooms_1, rooms_2, rooms_3, rooms_4);
        }
        output(rooms_1, rooms_2, rooms_3, rooms_4);
    }
    
    public static void deal(int u, int f, int r, int n, int[][] a, int[][] b, int[][] c, int[][] d){
        switch (u){
            case 1 :
                a[f-1][r-1] += n;
                break;
            case 2 :
                b[f-1][r-1] += n;
                break;
            case 3 :
                c[f-1][r-1] += n;
                break;
            case 4 :
                d[f-1][r-1] += n;
                break;
            default :
                break;
        }
    }
    
    public static void output(int[][] a, int[][] b, int[][] c, int[][] d){
        for (int m = 0; m < 3; m ++){
            for (int o = 0; o < 10; o ++)
                System.out.print(" " + a[m][o]);
            System.out.println();
        }
        System.out.println("####################");
        for (int m = 0; m < 3; m ++){
            for (int o = 0; o < 10; o ++)
                System.out.print(" " + b[m][o]);
            System.out.println();
        }
        System.out.println("####################");
        for (int m = 0; m < 3; m ++){
            for (int o = 0; o < 10; o ++)
                System.out.print(" " + c[m][o]);
            System.out.println();
        }
        System.out.println("####################");
        for (int m = 0; m < 3; m ++){
            for (int o = 0; o < 10; o ++)
                System.out.print(" " + d[m][o]);
            System.out.println();
        }
    }
}
