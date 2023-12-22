import java.util;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int count = 2;
        for (int i = 2; i <a ; i++) {
            if (a%i==0)
            {
            count++;
            }

        }
        System.out.println(count);
    }
}

