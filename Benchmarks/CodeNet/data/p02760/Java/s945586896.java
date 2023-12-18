import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int[][] a = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                a[i][j] = scan.nextInt();
            }
        }
        int n = scan.nextInt();
        int[] b = new int[n];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                for(int x = 0; x < n; x++){
                    if(a[i][j] == b[x]){
                        a[i][j] = 1;
                    }
                }
            }
        }
        if(a[0][0] == 1 && a[0][1] == 1 && a[0][2] == 1){
            System.out.println("Yes");
        }else if(a[0][0] == 1 && a[1][0] == 1 && a[2][0] == 1){
            System.out.println("Yes");
        }else if(a[0][0] == 1 && a[1][1] == 1 && a[2][2] == 1){
            System.out.println("Yes");
        }else if(a[1][0] == 1 && a[1][1] == 1 && a[1][2] == 1){
            System.out.println("Yes");
        }else if(a[2][0] == 1 && a[2][1] == 1 && a[2][2] == 1){
            System.out.println("Yes");
        }else if(a[0][1] == 1 && a[1][1] == 1 && a[1][2] == 1){
            System.out.println("Yes");
        }else if(a[0][2] == 1 && a[1][2] == 1 && a[2][2] == 1){
            System.out.println("Yes");
        }else if(a[0][2] == 1 && a[1][1] == 1 && a[2][0] == 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}