
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        String S=sc.next();
        int n=0;
        for(int i=0;i<6;i++){
            if(S.charAt(i)=='1'){
                n++;
            }
        }
        System.out.println(n);
    }
}
