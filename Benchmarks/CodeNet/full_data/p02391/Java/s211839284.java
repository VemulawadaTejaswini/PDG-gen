import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArray = br.readLine().split("\\s");
        int[] intArray;
        intArray = new int[strArray.length];
        String strComp = null;
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        switch (Integer.valueOf(intArray[0]).compareTo(intArray[1])) {
            case 1:
                strComp = ">";
                break;
            case -1:
                strComp = "<";
                break;
            case 0:
                strComp = "==";
                break;
        }
        System.out.println("a " + strComp + " b");
    }
}