import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int a, b;
        LinkedList<Integer> numberList = new LinkedList<Integer>();
        
        for(int i = 0; i < N; i++) {
            a = scan.nextInt();
            b = scan.nextInt();
            
            for(int j = 0; j < b; j++) {
                numberList.add(a);
            }
        }
        
        Collections.sort(numberList);
        
        System.out.println(numberList.get(K-1));
    }
}
