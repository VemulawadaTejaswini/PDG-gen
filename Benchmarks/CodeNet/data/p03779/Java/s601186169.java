import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        int X=scanner.nextInt(),i=1;
        for(int sum=0;sum<X;i++){
            sum+=i;
        }
        System.out.println(i-1);
    }
}
