import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [][][]room = new int[4][3][10];
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int b = sc.nextInt();//棟
            int f = sc.nextInt();//階
            int r = sc.nextInt();//部屋
            int v = sc.nextInt();//番目
            room[b - 1][f - 1][r - 1] += v;
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 10; k++){
                    System.out.print(" " + room[i][j][k]);
                }
                System.out.println();
            }
            if(i != 3)	System.out.println("####################");
        }
    }
}

