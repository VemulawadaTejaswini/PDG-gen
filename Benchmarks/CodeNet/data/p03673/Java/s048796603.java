import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        LinkedList<Integer> nums = new LinkedList<>();

        // input
        final int NUM = scan.nextInt();
        for(int i = 0; i < NUM; i++){
            if(i % 2 == 0){
                nums.addLast(scan.nextInt());
            } else {
                nums.addFirst(scan.nextInt());
            }
        }

        // answer
        if(NUM % 2 == 0){
            nums.forEach(a -> System.out.print(a + " "));
        } else {
            Collections.reverse(nums);
            nums.forEach(a -> System.out.print(a + " "));
        }
        

    }
}