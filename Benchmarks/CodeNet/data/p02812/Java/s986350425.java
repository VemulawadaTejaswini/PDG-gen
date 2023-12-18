import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        String s = scanner.next();
        int count = 0;
        for (int i=0;i<s.length()-2;i++){
            if (s.charAt(i)=='A'&&s.charAt(i+1)=='B'&&s.charAt(i+2)=='C'){
                count++;
            }
        }
        System.out.println(count);
    }
}