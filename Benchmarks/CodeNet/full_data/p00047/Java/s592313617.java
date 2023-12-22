package field;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Field {

    public static void main(String[] args) {

        Map<String, Integer> toIndex = new HashMap<>();
        toIndex.put("A", 0);
        toIndex.put("B", 1);
        toIndex.put("C", 2);

        Map<Integer, String> toAlphabet = new HashMap<>();
        toAlphabet.put(0, "A");
        toAlphabet.put(1, "B");
        toAlphabet.put(2, "C");

        int[] cap = {1, 0, 0};

        List<String[]> splitedString = read(",");
        for(String[] stringLine : splitedString) {
            swap(cap, toIndex.get(stringLine[0]), toIndex.get(stringLine[1]));
        }

        for(int cur = 0; cur < cap.length; cur++) {
            if(cap[cur] == 1) {
                System.out.println(toAlphabet.get(cur));
            }
        }
    }

    private static void swap(int[] array, int leftIndex, int rightIndex) {
        int temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
    }

    public static List<String[]> read(String delim) {
        Scanner scanner = new Scanner(System.in);
        List<String[]> splitedStringArray = new ArrayList<>();

        while (scanner.hasNext()) {
            splitedStringArray.add(scanner.nextLine().split(delim));
        }
        scanner.close();

        return splitedStringArray;
    }
}