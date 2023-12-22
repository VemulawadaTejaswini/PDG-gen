import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
 
 
class Main {
    public static void main(String[] a) throws IOException {
        Scanner scan = new Scanner(System.in);
        int time = scan.nextInt();
        for(int i = 0;i <= time;i++){
            String input = scan.nextLine();
            System.out.println(input.replaceAll("Hoshino","Hoshina"));
        }
    }
}