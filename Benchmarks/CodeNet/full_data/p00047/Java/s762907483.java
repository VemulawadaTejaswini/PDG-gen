import java.io.*;
import java.util.*;

class Test {
    public static void main(String[] args) {

        String[] indexToAlphabet = {"A", "B", "C"};
        Map<String, Integer> alphabetToIndex = new HashMap<>();
        for(int cur = 0; cur < indexToAlphabet.length; cur++){
            alphabetToIndex.put(indexToAlphabet[cur], cur);
        }

        Integer[] cup = {1, 0, 0};
        List<String[]> splitStringList = readStdInput(",");

        for(String[] stringLine : splitStringList){
            swap(cup, alphabetToIndex.get(stringLine[0]).intValue(), alphabetToIndex.get(stringLine[1]).intValue());
        }

        for(int cur = 0; cur < cup.length; cur++){
            if(cup[cur] == 1){
                formatPrintln("%s", indexToAlphabet[cur]);
                break;
            }
        }
    }

    private static void formatPrint(String format, Object... args) {
        System.out.print(String.format(format, args));
    }

    private static void formatPrintln(String format, Object... args) {
        formatPrint(format, args);
        System.out.println();
    }

    private static List<String[]> readStdInput(String delim) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String buffer = null;

        List<String[]> splitStringList = new ArrayList<>();

        try {
            while ((buffer = br.readLine()) != null) {

                // ??????????????°???????????\???????????\???????????¨?????????
                if (buffer.equals("")) {
                    break;
                }
                splitStringList.add(buffer.split(delim));
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return splitStringList;
    }

    private static <T> void swap(T[] array, int leftIndex, int rightIndex){
        T temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
    }
}