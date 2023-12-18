import java.lang.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        StringBuilder sb = new StringBuilder(scan.next());
        if(sb.length() == 3) System.out.println(sb.reverse());
        else System.out.println(sb);
        
    }
}
