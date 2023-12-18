import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] array = input.toCharArray();
        Arrays.sort(array);
        Set<Character> uniqueInput = new LinkedHashSet<>();
        for(int i=0; i<array.length; i++) {
            uniqueInput.add(array[i]);
        }
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int index = 0;
        int outputIndex = 0;
        boolean isNotExisted = false;
        for(Character c: uniqueInput) {
            while(!isNotExisted) {
                if(c == alphabet.charAt(index)) {
                    index++;
                    break;
                } else {
                    isNotExisted = true;
                    outputIndex = index;
                }
            }
            if(isNotExisted) {
                break;
            }
        }
        if(outputIndex == 0) {
            System.out.println("None");
        } else {
            System.out.println(alphabet.charAt(outputIndex));
        }
    }
}
