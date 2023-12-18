import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        PriorityQueue<Integer> red = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> green = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> colorless = new PriorityQueue<>(Comparator.reverseOrder());


        for (int i = 0; i < a; i++) {
            red.add(scan.nextInt());
        }

        for (int i = 0; i < b; i++) {
            green.add(scan.nextInt());
        }

        for (int i = 0; i < c; i++) {
            colorless.add(scan.nextInt());
        }

        long result = 0;
        while (x>0){
            if(!colorless.isEmpty() && (red.isEmpty() || red.peek() < colorless.peek())){
                result += colorless.poll();
            }else if(!red.isEmpty()){
                result+= red.poll();
            }
            x--;
        }

        while (y>0){
            if(!colorless.isEmpty() && ( green.isEmpty() || green.peek() < colorless.peek())){
                result += colorless.poll();
            }else if(!green.isEmpty()){
                result+= green.poll();
            }
            y--;
        }

        System.out.println(result);
    }
}
