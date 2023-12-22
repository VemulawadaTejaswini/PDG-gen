import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int count = 0;
        int max = 0;
        int tmp = 0;

        scanner.close();

        for (int i = 0; i < S.length(); i++){
            if (S.charAt(i) == 'R'){
                count++;
            } else {
                tmp = count;
                count = 0;
                if (tmp > max){
                    max = tmp;
                }
            }
        }
        
        System.out.println(max);
    }
}

