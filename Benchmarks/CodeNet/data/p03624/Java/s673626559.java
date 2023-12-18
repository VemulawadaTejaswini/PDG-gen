import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
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
        List<Character> strList = new ArrayList<>(uniqueInput);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int outputIndex = 0;
        boolean isNotExisted = false;
        for(int i=0; i<alphabet.length(); i++) {
            if(strList.get(i) != alphabet.charAt(i)) {
                isNotExisted = true;
                outputIndex = i;
                break;
            }
        }
        if(isNotExisted) {
            System.out.println(alphabet.charAt(outputIndex));
        } else {
            System.out.println("None");
        }
    }
}
