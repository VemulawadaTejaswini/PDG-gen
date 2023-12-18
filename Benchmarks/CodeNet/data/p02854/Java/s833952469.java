
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("入力してください > ");
        //int    x = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int[] data = new int[n];
        
        String[] ss = scanner.nextLine().split(" ");
        
        int total = 0;
        for(int i = 0 ; i < n ; i++){
            data[i] = Integer.parseInt(ss[i]);
            total += data[i];
        }
        
        //
        int temp = 0;
        for(int i = 0 ; i < n ; i++){
            temp += data[i];
            if(temp == total/2.0){
                System.out.println(0);
                return;
            }
            if(temp > total/2.0){
                break;
            }
        }

        
        System.out.println(temp - (total-temp));
        
        // Scannerクラスのインスタンスをクローズ
        scanner.close();
    }
}