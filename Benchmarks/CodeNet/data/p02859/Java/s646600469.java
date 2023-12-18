
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("入力してください > ");
        String input_text = scanner.nextLine();
        int r = Integer.parseInt(input_text);
        
        System.out.println(r*r);

        // Scannerクラスのインスタンスをクローズ
        scanner.close();
    }
}