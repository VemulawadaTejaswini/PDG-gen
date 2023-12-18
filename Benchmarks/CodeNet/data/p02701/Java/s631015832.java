import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] prize = new String[200000];
        int times = scanner.nextInt();
        

        int count = 0;
        boolean flg = true;

        for(int i = 0; i < times; i++) {
            
            prize[i] = scanner.next();

            for(int j = 0; j < i; j++) {
                if(prize[i].equals(prize[j])) {
                    flg = false;
                    break;
                } 
            }
            

            if(flg) {
                count++;
            } else {
                continue;
            }
            flg = true;
        }
    System.out.println(count);
    }
}