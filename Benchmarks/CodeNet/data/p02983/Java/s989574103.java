import java.util.Scanner;

class Solver{

    private final int L;
    private final int R;

    Solver(Scanner in){
        L = in.nextInt();
        R = in.nextInt();
    }

    void solve(){
        int l = L % 2019;
        if(R - L >= 2019){
            System.out.println(0);
            return;
        }
        System.out.println(l * (l + 1));
    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}