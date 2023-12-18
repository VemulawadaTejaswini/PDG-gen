import java.util.Scanner;
public class Main{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] array = new String[2];
        while(scanner.hasNext()) {
            for(int i=0; i<2; i++) {
                array[i] = scanner.nextLine();
            }
            int num = Integer.parseInt(array[0] + array[1]);
            if(num <= 1) {
                System.out.println("No");
                return;
            }

            for(int i=0; i<1000; i++) {
                if(i*i==num) {
                    System.out.println("Yes");
                    return;
                }
            }
            System.out.println("No");
        }
    }
}
