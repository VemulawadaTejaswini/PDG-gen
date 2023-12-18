import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
    }
}
