import java.util.Scanner;
class Main{
    int n,x,y,z;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(x = 3; x <= n; x++){
            y = x;
            z = 0;
            while(z != 1){
                if(y % 3 == 0 || y % 10 == 3){
                    System.out.printf(" %d",x);
                    z++;
                }else{
                    y /= 10;
                    if(y < 3){
                        z++;
                    }
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        new Main().solve();
    }
}