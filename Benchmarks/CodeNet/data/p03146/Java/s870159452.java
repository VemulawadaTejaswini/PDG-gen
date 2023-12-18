import java.io.*;
import java.util.*;

class Main {
	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);;
            Map<Integer,Integer> table = new HashMap<Integer,Integer>();
            int n = sc.nextInt();
            int count = 1;
            while(!table.containsKey(n)) {
                table.put(n,count);
                count++;
                if( (n & 1) == 1) {
                    n = 3*n + 1;
                } else {
                    n = n >> 1;
                }
            }
            System.out.println(count);
    }
}