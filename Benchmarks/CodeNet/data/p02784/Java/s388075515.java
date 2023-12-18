import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int hp = scanner.nextInt();
        int n = scanner.nextInt();
        int accumrate = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            accumrate += a;
            if(accumrate >= hp){
                break;
            }
        }
        if(accumrate >= hp)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}