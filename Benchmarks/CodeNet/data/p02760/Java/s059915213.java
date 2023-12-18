import java.util.*;
public class Main {
    public static int max(int a, int b){return (a > b ? a : b);}
    public static int min(int a, int b){return (a < b ? a : b);}
    public static int gcd(int a, int b){return (b > 0 ? gcd(b, a % b) : a);}
    public static int lcm(int a, int b){return a / gcd(a, b) * b;}
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int[][] A = new int[3][3] ;
        int[][] B = new int[3][3];
        for(int y = 0; y < 3; y++){
            for(int x = 0; x < 3; x++){
                A[y][x] = sc.nextInt();
            }
        }
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            int b = sc.nextInt();
            for(int y = 0; y < 3; y++){
               for(int x = 0; x < 3; x++){
                    if(A[y][x] == b)B[y][x] = 1;
                }
            }
        }
        String ans = "No";
        if(B[0][0] + B[1][1] + B[2][2] == 3)ans = "Yes";
        if(B[2][0] + B[1][1] + B[0][2] == 3)ans = "Yes";
        for(int i = 0; i < 3; i++){
            if(B[i][0] + B[i][1] + B[i][2] == 3)ans = "Yes";
            if(B[0][i] + B[1][i] + B[2][i] == 3)ans = "Yes";
        }
        System.out.println(ans);
    }
}
