import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        Scanner  sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        boolean flag = true;
        for (int x=0; x<= N; x++){
            for (int y =0; x+y <= N; y++){
                int z = N-y-x;
                if ((10000*x + 5000*y + 1000*z) == Y){
                    System.out.println(x+" "+ y+" "+z);
                    flag = false;
                    return;
                }
            }
        }
        if (flag){
            System.out.println("-1 -1 -1");
        }

    }
}