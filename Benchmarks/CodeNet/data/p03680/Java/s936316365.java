
import java.util.Scanner;

class Main {

    String Name;
    int V;
    boolean T;

    Main(String Name, int V, boolean T) {
        this.Name = Name;
        this.V = V;
        this.T = T;
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int N = Input.nextInt();
        Main A[] = new Main[N];
        for (int I = 0; I < N; I++) {
            A[I] = (new Main("B" + I, Input.nextInt() - 1, false));
        }
        int C = 1;
        boolean TF = false;
        int X = A[0].V;
        A[0].T = true;
        while (!TF) {

            if (A[X].Name.equals("B1")) {
                System.out.println(C);
                TF = true;
            } else if (A[X].T) {
                System.out.println("-1");
                TF = true;
            }

            A[X].T = true;
            X = A[X].V;
            C++;
        }

    }

}
//<<< Copying >>> Alert
//If(PersonCopy){System.out.print("You Are Not Learning");
