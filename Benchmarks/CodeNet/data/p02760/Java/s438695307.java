import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[][] a = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                a[i][j] = Integer.parseInt(sc.next());
            }
        }
        boolean[][] ok = new boolean[3][3];
        int n = Integer.parseInt(sc.next());
        for(int i = 0; i < n; i++){
            int b = Integer.parseInt(sc.next());
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 3; k++){
                    if(a[j][k] == b){
                        ok[j][k] = true;
                    }
                }
            }
        }
        boolean yes = false;
        for(int i = 0; i < 3; i++){
            if(ok[i][0] && ok[i][1] && ok[i][2]){
                yes = true;
            }
            if(ok[0][i] && ok[1][i] && ok[2][i]){
                yes = true;
            }
        }
        if(ok[0][0] && ok[1][1] && ok[2][2]){
            yes = true;
        }
        if(ok[0][2] && ok[1][1] && ok[2][0]){
            yes = true;
        }
        if(yes){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}