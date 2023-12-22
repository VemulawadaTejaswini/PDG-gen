import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> trains=new Stack<>();
        while (sc.hasNext()) {
            int n=sc.nextInt();
            if(n==0){
                System.out.println(trains.pop());
            }else{
                trains.push(n);
            }
        }
    }
}
