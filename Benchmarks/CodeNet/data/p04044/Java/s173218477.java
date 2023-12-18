import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void Solver(int numberOfString,int lengthOfString,String[] arr)
    {
        Arrays.sort(arr);
        String k = "";
        for (int i = 0; i < arr.length; i++) {
            k += arr[i];
        }
        System.out.println(k);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfString = input.nextInt();
        int lengthOfStrings = input.nextInt();
        String[] arr = new String[numberOfString];
        String temp;
        for (int i = 0; i < numberOfString; i++) {
            temp = input.next();
            if(temp.length() == lengthOfStrings)
                arr[i] = temp;
        }
        Solver(numberOfString,lengthOfStrings,arr);
    }
}
