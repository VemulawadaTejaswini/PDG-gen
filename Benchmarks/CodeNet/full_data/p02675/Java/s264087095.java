import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() % 10;

        String str = new String();
        if(n == 3){
            str = "bon";
        } else if(n == 0 || n == 1 || n == 6 || n == 8){
            str = "pon";
        } else{
            str = "hon";
        }

        System.out.println(str);
        sc.close();
    }
}