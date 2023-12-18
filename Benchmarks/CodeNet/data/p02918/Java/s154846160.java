import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        String strStdIn[] = in.readLine().split(" ");
        int n = Integer.parseInt(strStdIn[0]);
        int k = Integer.parseInt(strStdIn[1]);
        String str = in.readLine();
        
        ArrayList<Integer> rlist = new ArrayList<Integer>();
        ArrayList<Integer> llist = new ArrayList<Integer>();
        
        char pre = str.charAt(0);
        if (pre == 'R') {
            rlist.add(1);
        } else {
            llist.add(1);
        }
        
        for(int i = 1; i < str.length(); i++) {
        	char c = str.charAt(i);
        	if (c == 'R') {
        	    if (pre == 'R') {
        	        int get = rlist.get(rlist.size() - 1);
        	        rlist.set(rlist.size() - 1, get+1);
        	    } else {
        	        rlist.add(1);
        	    }
        	} else {
        	    if (pre == 'L') {
        	        int get = llist.get(llist.size() - 1);
        	        llist.set(llist.size() - 1, get+1);
        	    } else {
        	        llist.add(1);
        	    }
        	}
        	pre = c;
        }
        
        Collections.sort(rlist, Collections.reverseOrder());
        int rsum = 0;
        for(int i = 0; i < llist.size(); i++) {
            int get = llist.get(i);
            if (get > 1) {
                rsum += get -1;
            }
        }
        for(int i = 0; i < k; i++) {
            rsum += rlist.get(i) + 1;
        }
        Collections.sort(llist, Collections.reverseOrder());
        int lsum = 0;
        for(int i = 0; i < rlist.size(); i++) {
            int get = rlist.get(i);
            if (get > 1) {
                lsum += get -1;
            }
        }
        for(int i = 0; i < k; i++) {
            lsum += llist.get(i) + 1;
        }
        if (rsum > lsum) {
            System.out.println(rsum);
        } else {
            System.out.println(lsum);
        }
    }
}