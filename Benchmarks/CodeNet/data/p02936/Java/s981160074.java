import java.util.Scanner;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int q = sc.nextInt();
        int a[] = new int[n-1];
        int b[] = new int[n-1];
        int p[] = new int[q];
        int x[] = new int[q];
        boolean bool[][] = new boolean[n][n];
        int count[] = new int[n];
        for(int i = 0; i < n-1; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            for(int j = i; j < n; j++){
                bool[i][j] = false;
            }
            bool[a[i]-1][b[i]-1] = true;
            count[i] = 0;
            for(int j = i; j >= 0;j--){
                if(j != i){
                    if(b[j] == a[i]){
                        bool[a[j]-1][b[i]-1] = true;
                    }
                }
            }
            
        }
        count[n-1] = 0;

        for(int i = 0; i < q; i++){
            p[i] = sc.nextInt();
            x[i] = sc.nextInt();

            count[p[i]-1] += x[i];
            for(int j = 0; j < n; j++){
                if(bool[p[i]-1][j]){
                    count[j] += x[i];
                }
            }
        }
        for(int i = 0; i < n-1; i++){
            System.out.print(count[i]+" ");
        }
        System.out.println(count[n-1]);
    }
}