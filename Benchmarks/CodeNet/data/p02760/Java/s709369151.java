import java.math.*;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] ary = new int[3][3];
        boolean[][] c = new boolean[3][3];
        String ans = "No";
        for(int i=0;i<3;i++){
            for(int j =0;j<3;j++){
                ary[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        int[] b = new int[n];
        for(int i = 0;i<b.length;i++){
            b[i] = sc.nextInt();
        }
        for(int i = 0;i<3;i++){
            for(int j = 0; j<3; j++){
                for(int k =0 ;k<b.length;k++){
                    if(b[k]==ary[i][j]){
                        c[i][j] = true;
                    }
                }
                }
            }
            if(c[0][0]&&c[0][1]&&c[0][2]){
                ans = "Yes";
            } else if(c[1][0]&&c[1][1]&&c[1][2]){
                ans = "Yes";
            } else if(c[2][0]&&c[2][1]&&c[2][2]){
                ans = "Yes";
            } else if(c[0][0]&&c[1][0]&&c[2][0]){
                ans = "Yes";
            } else if(c[0][1]&&c[1][1]&&c[2][1]){
                ans = "Yes";
            } else if(c[0][2]&&c[1][2]&&c[2][2]){
                ans = "Yes";
            } else if(c[0][0]&&c[1][1]&&c[2][2]){
                ans = "Yes";
            } else if(c[2][0]&&c[1][1]&&c[0][2]){
                ans = "Yes";
            }
            System.out.println(ans);
        }
        }
