import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int count2 = 0;
        for(int i = a; a <= b; a++) {
            if(c%a == 0) {
                count2++;
            }
        }
        System.out.println(count2);
    }
}

