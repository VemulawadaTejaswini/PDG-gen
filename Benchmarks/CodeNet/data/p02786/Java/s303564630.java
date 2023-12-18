import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        System.out.println(func(H));
    }

    public static long func(long hp){
        if(hp == 1){return 1;}
        return func(hp/2)*2+1;
    }
}
