import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();

        long zero = 0;
        long one = 0;

        for(char c: S.toCharArray()){
            if(c == '0'){
                zero++;
            }else{
                one++;
            }
        }

        System.out.println(Math.min(zero, one) * 2);
    }
}
