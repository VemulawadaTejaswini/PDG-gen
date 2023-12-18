import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] numList = new int[num];
        String[] numListstr = scan.nextLine().split(" ",0);
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<num; i++) {
            numList[i] = Integer.valueOf(numListstr[i]);
        }

        for(int i=0; i<num; i++) {
            result.add(numList[i], i+1);
        }

        for(int i=0; i<num; i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}
