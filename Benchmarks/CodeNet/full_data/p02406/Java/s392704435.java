import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int x = 1; x <= n; x++){
            if(x % 3 == 0){
                System.out.print(" " + x);
            }
            else if(x % 10 == 3){
                System.out.print(" " + x);
            }
        }
        System.out.println();
    }
}
