import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        long max = 42875000000L;
        long n = scanner.nextLong();

        long h;
        if (n > 2){
            for (int i = 1; i <= 3500; i++) {
                boolean found = false;
                for (int j = 1; j <= 3500; j++) {
                    if ((4*i*j - i*n - j*n) > 0){
                        h = i*j*n/(4*i*j - i*n - j*n);
                        if (h > 0 && h*(4*i*j - i*n - j*n) == i*j*n){
                            System.out.println(i + " " + j + " " + h);
                            found = true;
                            break;
                        }
                    }
                }
                if (found)break;
            }
        }
        else {
            if (n == 2) System.out.println("1 2 2");
        }
    }
}
