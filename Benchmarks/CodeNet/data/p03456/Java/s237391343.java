import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = a * b;
        String res = "No";
        for(int i = 1; i * i <= 100100; i++) {
            if(i * i == p) {
                res = "Yes";
                break;
            }
        }
        System.out.println(res);
    }

}
