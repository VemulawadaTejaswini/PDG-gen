import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] c = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                c[i][j] = sc.nextInt();
            }
        }

        boolean flag = true;
        for(int i = 0; i < 3; i++){
            if(c[0][0] - c[i][0] != c[0][1] - c[i][1]){
                flag = false;
                break;
            }
            if(c[0][1] - c[i][1] != c[0][2] - c[i][2]){
                flag = false;
                break;
            }
            if(c[0][0] - c[i][2] != c[0][2] - c[i][2]){
                flag = false;
                break;
            }
        }

        if(flag) System.out.println("Yes");
        else System.out.println("No");
          
    }
}