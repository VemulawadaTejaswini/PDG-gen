import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        sc.close();
        Long pow = 1L;

        for(Long i = 1L; i <= n; i++){
            pow = i * pow % 1000000007L;
        }

        System.out.println(pow);
    }

}

