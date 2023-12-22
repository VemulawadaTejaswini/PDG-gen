import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int d=sc.nextInt();
            int x=0;
            for(int i=0;i<600/d;i++){
                x+=i*i*d*d*d;
            }
            System.out.println(x);
        }
    }
}
