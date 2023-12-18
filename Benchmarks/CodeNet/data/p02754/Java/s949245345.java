import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        new Main().solve();
    }

    void solve(){

        int N, A, B;

        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        A = Integer.parseInt(sc.next());
        B = Integer.parseInt(sc.next());
        sc.close();

        int numOfblue;

        numOfblue = N * A / (A + B);

        if(N % (A + B) >= A){
            numOfblue = numOfblue + A;
        }
        else{
            numOfblue = numOfblue + N % (A + B);
        }

        System.out.println(numOfblue);
    }

       
}