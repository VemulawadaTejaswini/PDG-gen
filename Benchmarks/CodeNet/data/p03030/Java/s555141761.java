import java.util.*;
import java.math.*;
import java.io.*;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int n = sc.nextInt();
        Data[] d = new Data[n];
        for(int i = 0; i < n; i++) {
            d[i] = new Data(sc.next(), sc.nextInt());
        }
        Arrays.sort(d);
        for(int i = 0; i < n; i++) {
            System.out.println(d[i].id);
        }
    } 
    static class Data implements Comparable<Data> {
        static int ID = 1;
        int id;
        String s;
        int p;
        Data(String a, int b) {
            s = a;
            p = b;
            id = ID++;
        }

        public int compareTo(Data o) {
            if(s.equals(o.s)) return -this.p + o.p;
            return s.compareTo(o.s);
        }        
    }
}