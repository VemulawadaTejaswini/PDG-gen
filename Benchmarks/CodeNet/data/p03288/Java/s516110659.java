import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        if(n < 1200){
            System.out.println("ABC");
        }else if(n < 2800){
            System.out.println("ARC");
        }else{
            System.out.println("AGC");
        }
    }
}
