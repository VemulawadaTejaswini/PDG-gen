import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String sa = "";
        String sb = "";
        for(int i = 0;i < b;i++){
            sa += String.valueOf(a);
        }
        for(int i = 0;i < a;i++){
            sb += String.valueOf(b);
        }
        System.out.println(a>=b?sb:sa);
    }
}