import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.println(ToAlphabet(n));

    }

    static StringBuilder ToAlphabet(long columnNo){
        String alphabet = "zabcdefghijklmnopqrstuvwxy";
        StringBuilder columnStr = new StringBuilder();
        int m = 0;

        do
        {
            m = (int)columnNo % 26;
            columnStr.insert(0, (char)((int)alphabet.charAt(m)));
            columnNo = columnNo / 26;
        } while (0 < columnNo && m != 0);

        return columnStr;
    }

}
