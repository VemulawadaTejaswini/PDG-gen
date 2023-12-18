import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0, temp = 0;
        LinkedList out = new LinkedList();
        for (int i = 0; i < n; i++) {
            temp = scanner.nextInt();
            if (!out.contains(temp)) {
                out.add(temp);
                result ++;
            } else {
                for (int j = 0; j < n; j++) {
                    if (temp == (int)(out.get(j))) {
                        out.remove(j);
                        result --;
                        break;
                    }
                }
            }
        }
        System.out.println(result);
    }
}