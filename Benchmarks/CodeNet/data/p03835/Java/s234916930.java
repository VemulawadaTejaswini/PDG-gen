import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int target = scanner.nextInt();
        int count = 0;

        for(int i=0; i<=sum; i++) {
            for(int j=0; j+i<=sum; j++) {
                for(int k=0; k+j+i<=sum; k++) {
                    if(target == i + k + j) {
                        count += 1;
                    } 
                }
            }
        }
        System.out.println(count);
    }
}
