import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputA = scanner.nextLine();
        String inputB = scanner.nextLine();
        char[] arrayA = inputA.toCharArray();
        char[] arrayB = inputB.toCharArray();
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        String desStr = new String(arrayA);
        char[] tmpRevArray = arrayB;
        StringBuilder revStr = new StringBuilder();
        for(int i=tmpRevArray.length-1; i>=0; i--) {
            revStr.append(Character.toString(tmpRevArray[i]));
        }

        if(desStr.compareTo(revStr.toString()) >= 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
