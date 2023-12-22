import java.util.Scanner;
class Main{
    int n,i,a;
    int max = -9999999;
    int min = 9999999;
    long sam = 0;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i = 0; i < n; i++){
            a = sc.nextInt();
            sam += a;
            if(n == 0){
                min = 0;
                max = 0;
            }else if(n == 1){
                max = a;
                min = a;
            }else if(a < min){
                min = a;
            }else if(a > max){
                max = a;
            }else if(a == min || a == max){
                continue;
            }
            
        }
    System.out.println(min + " " + max + " " + sam);
    }
    public static void main(String[] args){
        new Main().solve();
    }
}