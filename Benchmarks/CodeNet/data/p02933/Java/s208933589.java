import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String s = scanner.next();
        if(N >= 3200){
            System.out.println(s);
        }else{
            System.out.println("red");
        }
    }
}
