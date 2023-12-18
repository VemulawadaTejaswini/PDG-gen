import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
 		int b_num = (int)(x-a)/b
        int result = x - a - b * b_num;
        System.out.print(result);
    }
}