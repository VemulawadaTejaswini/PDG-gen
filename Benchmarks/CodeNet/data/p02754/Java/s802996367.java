import java.util.*;

class Main{
    Main(){
        Scanner SC = new Scanner(System.in);

        long N = Long.parseLong(SC.next());
        long A = Long.parseLong(SC.next());
        long B = Long.parseLong(SC.next());

        long R = N / (A+B) * A;
        if( N%(A+B) > A){
            R += A;
        } else {
            R += N % (A+B);
        }

        System.out.println(R);
    }

    public static void main(String[] args){
        Main main = new Main();
    }
}
