import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();


        List<Integer> group1 = Arrays.asList(1,3,5,7,8,10,12);
        List<Integer> group2 = Arrays.asList(4,6,9,11);
        List<Integer> group3 = Arrays.asList(2);

        if((group1.contains(x) && group1.contains(y)) || (group2.contains(x) && group2.contains(y))){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
