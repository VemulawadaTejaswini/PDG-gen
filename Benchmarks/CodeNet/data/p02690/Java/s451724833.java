import java.util.*;

class Main{
    public Main(){
        Scanner SC = new Scanner(System.in);
        long X = Long.parseLong(SC.next());

        if(X == 1){
            System.out.println(0 + " " + -1);
            return;
        }

        long A, B, V, temp;
        for(long i=1;i<=X;i++){
            if(X % i == 0){
                V = X / i;
                B = 0;
                while(true){
                    A = i + B;
                    if(A*A*A*A*A-B*B*B*B*B == X){
                        System.out.println(A + " " + B);
                        return;
                    }
                    if(A*A*A*A*A+B*B*B*B*B == X){
                        System.out.println(A + " -" + B);
                        return;
                    }
                    B++;
                    if(A*A*A*A-A*A*A*B+A*A*B*B-A*B*B*B+B*B*B*B > V) break;
                }
            }
        }
    }

    public static void main(String args[]){
        Main main = new Main();
    }
}
