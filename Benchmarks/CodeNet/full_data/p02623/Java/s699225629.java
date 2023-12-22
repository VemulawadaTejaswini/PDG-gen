import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        long k = input.nextLong();
        LinkedList<Long> stackOne = new LinkedList<>();
        LinkedList<Long> stackTwo = new LinkedList<>();
        for(int i = 0; i < n; i ++) {
            stackOne.add(input.nextLong());
        }
        for(int i = 0; i < m; i ++) {
            stackTwo.add(input.nextLong());
        }
        long book = 0;
        while(true) {
            if(!stackOne.isEmpty() && !stackTwo.isEmpty()) {
                if(stackOne.getFirst() < stackTwo.getFirst()) {
                    if(k - stackOne.getFirst() >= 0) {
                        k -= stackOne.removeFirst();
                    }
                    else {
                        break;
                    }
                }
                else {
                    if(k - stackTwo.getFirst() >= 0) {
                        k -= stackTwo.removeFirst();
                    }
                    else {
                        break;
                    }
                }
                book ++;
            }
            else if(!stackOne.isEmpty()) {
                if(k - stackOne.getFirst() >= 0) {
                    k -= stackOne.removeFirst();
                }
                else {
                    break;
                }
                book ++;
            }
            else if(!stackTwo.isEmpty()) {
                if(k - stackTwo.getFirst() >= 0) {
                    k -= stackTwo.removeFirst();
                }
                else {
                    break;
                }
                book ++;
            }
            else {
                break;
            }
        }
        System.out.println(book);
    }

}