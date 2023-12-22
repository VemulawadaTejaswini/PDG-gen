import java.util.Scanner;
class Main{
    int n,x;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int [n];
        for(x = 0; x < n; x++){
            a[x] = sc.nextInt();
        }
        for(x = n-1;x >= 0; x--){
            if(x != 0){
                System.out.printf("%d ",a[x]);
            }else{
                System.out.printf("%d\n",a[x]);
            }
        }
    }
    public static void main(String[] args){
        new Main().solve();
    }
}