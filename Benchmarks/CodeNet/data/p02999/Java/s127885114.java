
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        if(x < a){
            System.out.print(0);
        }else{
            System.out.print(10)
        }
        sc.close();
    }
}