/*
 * There is a data which provides heights (in meter) of mountains. The data is only for ten mountains.
 *
 * Write a program which prints heights of the top three mountains in descending order.
 */
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.io.IOException;

class ListOfTop3Hills {
    public static final int MaxInputNumber = 10;
    public static final int MaxOutputNumber = 3;
    private static ListOfTop3Hills top3Hills = new ListOfTop3Hills();

    private ArrayList<Integer> inputList;

    private ListOfTop3Hills() {
        inputList = new ArrayList();
    }

    public static final ListOfTop3Hills getInstance() {
        return top3Hills;
    }

    final public boolean Run() {
        for (int i = 0; i < MaxInputNumber; ++i) {
            int num = 0;
            try {
                num = Integer.parseInt(ReadLine());
            } catch (NumberFormatException e) {
                return false;
            }
            inputList.add(num);
        }

        SortedList();
        printTop3();

        return true;
    }

    final protected String ReadLine() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        try {
            line = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return line;
    }

    final protected void SortedList() {
        inputList.sort(Comparator.reverseOrder());
    }

    final protected void printTop3() {
        for (int i = 0; i < MaxOutputNumber; ++i) {
            System.out.println(inputList.get(i));
        }
    }

}
/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String...args) {

        ListOfTop3Hills.getInstance().Run();
    }

}