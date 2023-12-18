import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Queue;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        /*
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int n = word.length();
        int maximumLength = 0;
        boolean zFound = false;
        for (int i = 0; i < n; i++) {
            if(word.charAt(i) == 'A')
            {
                for (int j = i+1; j < n; j++) {
                    if(word.charAt(j) == 'Z')
                    {
                        zFound = true;
                        if(j-i+1 > maximumLength)
                        {
                            maximumLength = j - i + 1;
                        }
                    }
                    else if(zFound && word.charAt(j) != 'Z')
                    {
                        zFound = false;
                        break;
                    }
                }
            }
        }
        System.out.println(maximumLength);
        */
        Scanner input = new Scanner(System.in);
        int n =Integer.parseInt(input.nextLine());
        String word = input.nextLine();
        int x = 0;
        int maximumX = 0;

        for (int i = 0; i  < n ; i++) {
            if(word.charAt(i) == 'I')
                x++;
            else
                x--;
            if(x > maximumX)
                maximumX = x;
        }
        System.out.println(maximumX);

        }
}