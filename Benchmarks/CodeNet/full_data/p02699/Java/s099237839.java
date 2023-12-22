import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int times = scanner.nextInt();
        String[] prize = new String[times];

        int count = 0;
        boolean flg = true; //同じ要素がなかった場合にtrue

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
            }
            flg = true;
        }
    System.out.println(count);
    }
}