import java.util.Scanner;
class Main{
    int n,m,x,y;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\s");
        n = sc.nextInt();
        m = sc.nextInt();
        int [] []A = new int[n][m];
        int [] b = new int[m];
        int [] c = new int[n];
        for(x = 0; x < n; x++){
            c[x] = 0;
            for(y = 0; y < m; y++){
                A[x] [y]= sc.nextInt();
            }
        }
        for(y = 0; y < m; y++){
            b[y]= sc.nextInt();
        }
        for(x = 0; x < n; x++){
            for(y = 0; y < m; y++){
                c[x] = c[x] + A[x][y] * b[y];
            }
        }
        for(x = 0; x < n; x++){
            System.out.println(c[x]);
        }
    }
    public static void main(String[] args){
        new Main().solve();
    }
}