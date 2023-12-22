
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Diceca dice1 = new Diceca(stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt());
        Diceca dice2 = new Diceca(stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt());
        boolean a = solv(dice1, dice2, 0);
        System.out.println((a)?"Yes":"No");
    }
    public static boolean solv(Diceca f, Diceca diceca, int count){
        if(diceca.Top == f.Top && diceca.S == f.S && diceca.Bottom == f.Bottom && diceca.E == f.E && diceca.N == f.N && diceca.W == f.W) return true;
        if(count == 6) return false;
        Diceca tmp = new Diceca(diceca.Top, diceca.S, diceca.E, diceca.W, diceca.N, diceca.Bottom);
        tmp.TurnN();
        if(solv(f, tmp, count+1)){
            return true;
        }
        tmp = new Diceca(diceca.Top, diceca.S, diceca.E, diceca.W, diceca.N, diceca.Bottom);
        if(solv(f, tmp, count+1)){
            return true;
        }
        tmp = new Diceca(diceca.Top, diceca.S, diceca.E, diceca.W, diceca.N, diceca.Bottom);
        tmp.TurnE();
        tmp = new Diceca(diceca.Top,diceca.S,diceca.E,diceca.W,diceca.N,diceca.Bottom);
        tmp.TurnW();
        if(solv(f,tmp,count+1)) {
            return true;
        }

        return false;
    }

}
class Diceca {
    int Top;//1
    int Bottom;//6
    int N;//5
    int S;//2
    int W;//4
    int E;//3

    Diceca(int a, int b, int c, int d, int e, int f){
        Top = a;
        S = b;
        E = c;
        W = d;
        N = e;
        Bottom = f;
    }

    public void TurnN() {
        int tmp = Top;
        Top = S;
        S = Bottom;
        Bottom = N;
        N = tmp;
    }

    public void TurnW() {
        int tmp = Top;
        Top = E;
        E = Bottom;
        Bottom = W;
        W = tmp;
    }

    public void TurnE() {
        int tmp = Top;
        Top = W;
        W = Bottom;
        Bottom = E;
        E = tmp;
    }

    public void TurnS() {
        int tmp = Top;
        Top = N;
        N = Bottom;
        Bottom = S;
        S = tmp;
    }
}
