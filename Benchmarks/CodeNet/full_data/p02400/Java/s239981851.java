import java.util.Scanner;
class Main{
    int r;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        System.out.printf("%3.6f %3.6f",(double)r*r*3.141592653589,(double)2*r*3.141592653589);
    }
    public static void main(String[] args){
        new Main().solve();
    }
}