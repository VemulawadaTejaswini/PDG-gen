import java.util.*;
import java.io.*;
public class Main {
 public static void main(String[] args) throws Exception {
   Scanner file = new Scanner(System.in);
   int n = file.nextInt();
   long[] a = new long[10000];
   long t = 0;
   for (int i = 0; i < n; i++) {
    int s = 0;
    char[] l = file.next().toCharArray();
    for (char c : l) s += c - 'a';
    t += a[s];
    a[s]++;
   }
   System.out.println(t);
 }
}
