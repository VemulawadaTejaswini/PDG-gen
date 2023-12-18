import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int X = Integer.parseInt(sc.next());
        sc.close();

        final int Y = X / 100;
        final int Z = X % 100;

        boolean f = false;
        if (X<100) {
        } else {
            outside : for (int i=0; i<=Y; i++) {
            for (int j=0; j<=Y; j++) {
            for (int k=0; k<=Y; k++) {
            for (int l=0; l<=Y; l++) {
            for (int m=0; m<=Y; m++) {
            for (int n=0; n<=Y; n++) {
                int SUM = i*5+j*4+k*3+l*2+m;
                if (Z==SUM && Y==i+j+k+l+m+n) {
                    f=true;
                    break outside;
                } else if (Z<SUM) {
                    break;
                }
            }}}}}}
            if (f) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}