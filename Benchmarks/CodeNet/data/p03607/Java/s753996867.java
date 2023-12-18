import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0, temp = 0;
        Vector vector = new Vector();
        for (int i = 0; i < n; i++) {
            temp = scanner.nextInt();
            if (!vector.contains(temp)) {
                vector.add(temp);
                result ++;
            } else {
                vector.removeElement(temp);
                result --;
            }
        }
        System.out.println(result);
    }
}