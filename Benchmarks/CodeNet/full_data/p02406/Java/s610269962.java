import java.util.Scanner;
class Main{
    int n,x;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(x = 1; x <= n; x++){
            if(x % 3 == 0 || x % 10 == 3){
                System.out.printf(" %d",x);
            }else if(x / 10 == 3 || x / 100 == 3 || x / 1000 == 3 || x / 10000 == 3){
                System.out.printf(" %d",x);
            }else if(x - x / 100 * 100 > 29 && x - x / 100 * 100 < 40){
                System.out.printf(" %d",x);
            }else if(x - x / 1000 * 1000 >= 300 && x - x / 1000 * 1000 < 400){
                System.out.printf(" %d",x);
            }else if(x - x / 10000 * 10000 >= 3000 && x - x / 10000 * 10000 < 4000){
                System.out.printf(" %d",x);
            }
        }

        System.out.println();
    }
    public static void main(String[] args){
        new Main().solve();
    }
}