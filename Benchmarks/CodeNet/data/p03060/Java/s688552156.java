import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int V[] = new int[n];
        int C[] = new int[n];
        int ans=0;
        for(int i=0;i<n;i++)V[i] = sc.nextInt();
        for(int i=0;i<n;i++){
            C[i] = sc.nextInt();
            if((V[i]-C[i]) > 0){
                ans += (V[i]-C[i]);
            }
        }
        System.out.println(ans);
    }
}