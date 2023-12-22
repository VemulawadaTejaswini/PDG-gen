import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        if(h!=0&&w!=0) {
            for (int j = 0; j <= h; j++) {
                for (int i = 0; i <= w; i++) {
                    System.out.print("#");

                }
                System.out.println("");
            }
        }

    }
}

