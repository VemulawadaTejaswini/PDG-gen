import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] c = new int[3][3];
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                c[i][j] = sc.nextInt();
            }
        }
        int kari = c[0][0] - c[0][1];
        if(kari == c[1][0] - c[1][1] && 
           kari == c[2][0] - c[2][1]){
            kari = c[0][1] - c[0][2];
            if(kari == c[1][1] - c[1][2] && 
               kari == c[2][1] - c[2][2]){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}