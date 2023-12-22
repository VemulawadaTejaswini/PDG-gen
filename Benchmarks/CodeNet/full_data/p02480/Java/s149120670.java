import java.util.Scanner;
class Main{

    public void solve(){
        Scanner sc = new Scanner(System.in);
        int x, an;
        x = sc.nextInt();
        an = x * x * x;
        System.out.println(an);

    }

    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}