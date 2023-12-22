import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] in = str.split(" ",0);
        int a = Integer.valueOf(in[0]);
        int b = Integer.valueOf(in[1]);
        int c = Integer.valueOf(in[2]);
        int k = Integer.valueOf(in[3]);
        int out;
        if(k <= (a + b + c) && (a + b + c) <= 2*Math.pow(10 , 9)){
            if(k - a >= 0){
                out = a;
                k = k - a;
                if(k - b >= 0){
                    out = out - (k-b);
                }
            }else {
                out = k;
            }
            System.out.println(out);
        }
    }
}
