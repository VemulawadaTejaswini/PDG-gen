
import java.util.Scanner;

public class Main {
   static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursive(0,0,100,0,n);
        sb.append("100.00000000 0.00000000");
        System.out.println(sb.toString());
    }

    private static void recursive(double st1,double st2, double en1,double en2, int n) {
        if (n==0){
          sb.append(st1+" ").append(st2+"\n");
          return;
        }
        double h = Math.hypot(en1 - st1, en2 - st2) ;//+ (en2 - st2) / 2
        double k = Math.sqrt(3) / 2 * (h / 3);
        double v = k * (en1 - st1) /h;

        recursive(st1,st2,st1+(en1-st1)/3,st2+(en2-st2)/3,n-1);
        recursive(st1+(en1-st1)/3,st2+(en2-st2)/3,(en1+st1)/2-(Math.sqrt(Math.pow(k,2)-Math.pow(v,2))),v+(en2+st2)/2,n-1);
        recursive((en1+st1)/2-(Math.sqrt(Math.pow(k,2)-Math.pow(v,2))),v+(en2+st2)/2,st1+((en1-st1)/3*2),st2+((en2-st2)/3*2),n-1);
        recursive(st1+((en1-st1)/3*2),st2+((en2-st2)/3*2),en1,en2,n-1);
    }
}

