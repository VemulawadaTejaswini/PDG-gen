import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1; i<= x; ++i){
            if((i % 3) == 0){
                System.out.printf(" %d", i);
            }
            else if((i % 10) == 3){
                System.out.printf(" %d", i);
            }
        }

        System.out.printf("\n");

    }
}