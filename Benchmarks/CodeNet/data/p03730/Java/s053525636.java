import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        HashSet<Integer> hashSet = new HashSet<>();

        int candidate = A;

        while (!hashSet.contains(candidate)){
            if(C == (candidate % B)){
                System.out.println("YES");
                return;
            }else{
                if(hashSet.contains(candidate % B)){
                    break;
                }
                hashSet.add(candidate % B);
                candidate += A;
            }
        }

        System.out.println("NO");

    }
}
