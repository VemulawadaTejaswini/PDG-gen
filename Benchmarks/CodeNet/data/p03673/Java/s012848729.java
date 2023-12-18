import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        Integer[] numbers = new Integer[line];
        Integer[] answer_Numbers = new Integer[line];
        Integer[] reverse_Numbers = new Integer[line];
        
        for (int i = 0; i < line; i++) {
            numbers[i] = sc.nextInt();
        }
        
        for (int i = 0; i < line; i++) {
            answer_Numbers[i] = numbers[i];
            for (int j = 0; j <= i; j++) {
                reverse_Numbers[i - j] = answer_Numbers[j];
            }
            for (int k = 0; k <= i; k++) {
                answer_Numbers[k] = reverse_Numbers[k];
            }
            
        }
        for (Integer i : answer_Numbers) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
    
}