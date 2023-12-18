import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
      	long n = Integer.parseInt(sc.next());
      	ArrayList<String> list = new ArrayList<>();
      	for (long i = 0; i < n; i++) {
        	list.add(sc.next());
        }
      
      	long m = Integer.parseInt(sc.next());
      	if (n < m) { System.out.println("NO"); return; }
      	for (long i = 0; i < m; i++) {
        	if(!list.remove(sc.next())) { System.out.println("NO"); return; };
        }
      	System.out.println("YES");
    }
}