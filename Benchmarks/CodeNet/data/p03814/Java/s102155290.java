import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int first = -1, last = -2;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == 'A'){
                first = i;
                break;
            }
        }
        for(int i = input.length() - 1; i >= 0; i--){
            if(input.charAt(i) == 'Z'){
                last = i;
                break;
            }
        }
        System.out.println(last - first + 1);
    }
}