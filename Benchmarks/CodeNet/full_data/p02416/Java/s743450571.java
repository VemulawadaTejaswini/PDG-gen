import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(true) {
            String line = scan.nextLine();
            if("0".equals(line)) {
                break;
            }

            char[] swap = line.toCharArray();
 
            int sum = 0;
            for(int i = 0; i < swap.length; i++) {
                sum += Character.getNumericValue(swap[i]);
            }

            System.out.println(sum);
        }
    }
}
