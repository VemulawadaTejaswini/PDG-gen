import java.util.*;

class Main{
    Main(){
        Scanner SC = new Scanner(System.in);

        long N = Long.parseLong(SC.next());
        long A = Long.parseLong(SC.next());
        long B = Long.parseLong(SC.next());

        long T = 0, R = 0;
        while(T < N){
            T += A+B;
            R += A;
        }

        System.out.println(R);
    }

    public static void main(String[] args){
        Main main = new Main();
    }
}
