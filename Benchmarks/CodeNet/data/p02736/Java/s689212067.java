import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String args[]) { 

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int[] intArray = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            intArray[i] = Character.digit(s.charAt(i), 10);
        }

        for(int i=0; i<(intArray.length-1); i++){
            int j = 0;

            while(j<(n-1)) {
                intArray[j] = Math.abs(intArray[j] - intArray[j+1]);
                j++;
            }
            n--;
        }
        System.out.println(intArray[0]);
        sc.close();
    }
}

    