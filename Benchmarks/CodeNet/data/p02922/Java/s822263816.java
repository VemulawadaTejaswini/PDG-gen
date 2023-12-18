import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();
        int res  = 0;
        int c = 1;
        while(c < b){
            c+=a-1;
            res++;
        }
        System.out.println(res);
    }
}