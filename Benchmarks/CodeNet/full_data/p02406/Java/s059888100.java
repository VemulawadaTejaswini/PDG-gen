import java.util.*;

class Main{
    public static void main(String[] args){
        int n;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        for (int i = 1; i <= n; i++){
            if (i % 3 == 0){
                System.out.print(" " + i);
                continue;
            } else if (i % 10 == 3){
                System.out.print(" " + i);
            }
        }
    }
}