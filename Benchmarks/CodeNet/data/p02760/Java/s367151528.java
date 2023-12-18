import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int[][] a = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                a[i][j] = stdIn.nextInt();
            }
        }
        int n = stdIn.nextInt();
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            b[i] = stdIn.nextInt();
        }

        int[][] map = {{0,0,0}, {0,0,0}, {0,0,0}};

        for(int k = 0; k < n; k++){
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    if(a[i][j] == b[k]) map[i][j] = 1;           
                }
            }
        }
        boolean flag = false;
        if(map[0][0] == 1 && map[0][1] == 1 && map[0][2] == 1) flag = true;
        if(map[1][0] == 1 && map[1][1] == 1 && map[1][2] == 1) flag = true;
        if(map[2][0] == 1 && map[2][1] == 1 && map[2][2] == 1) flag = true;
        if(map[0][0] == 1 && map[1][0] == 1 && map[2][0] == 1) flag = true;
        if(map[0][1] == 1 && map[1][1] == 1 && map[2][1] == 1) flag = true;
        if(map[0][2] == 1 && map[1][2] == 1 && map[2][2] == 1) flag = true;
        if(map[0][0] == 1 && map[1][1] == 1 && map[2][2] == 1) flag = true;
        if(map[2][0] == 1 && map[1][1] == 1 && map[0][2] == 1) flag = true;
        if(flag == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}