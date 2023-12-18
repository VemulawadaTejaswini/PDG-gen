import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {
    static final Scanner cin = new Scanner(System.in);

    public static void main(String args[]){
        char[] str = cin.next().toCharArray();
        int K = cin.nextInt();
        int res = 0;
        char c;
        for (int i = 0; i < str.length && K > 0; i++)
        {
            c = str[i];
            res = 'z' - c + 1;
            if (res <= K)
            {
                K -= res;
                str[i] = 'a';
            }
        }
        if(K > 0)
        {
            str[str.length - 1] = (char)(str[str.length - 1] + K % 26);
        }
        System.out.println(str);

    }
}