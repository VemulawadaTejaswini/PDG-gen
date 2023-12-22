import java.util.Scanner;

/**
 * Created by labuser on 2016/04/19.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {

        int a, b;

        Scanner sc = new Scanner(System.in);
        while(true){
            String[] input = sc.nextLine().split(" ");
            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1]);
            if(a ==0 && b ==0){
                break;
            }
            System.out.println(Math.min(a,b)+" "+Math.max(a,b));
        }

    }
}