import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String temp = sc.nextLine();

        ArrayList<String> tempArr = new ArrayList<String>(Arrays.asList(temp.split("")));

        int counter = 0;
        while (checkExist(tempArr)) {
            for (int i = 0; i < tempArr.size() - 1; i++)  {
                if (!tempArr.get(i).equals(tempArr.get(i + 1))) {
                    tempArr.remove(i);
                    tempArr.remove(i);
                    counter += 2;
                    break;
                }
            }
        }
        System.out.println(counter);


    }

    static Boolean checkExist(ArrayList<String> tempArr) {
        for (int i = 0; i < tempArr.size() - 1; i++)  {
            if (!tempArr.get(i).equals(tempArr.get(i + 1))) {
                return true;
            }
        }
        return false;
    }
}
