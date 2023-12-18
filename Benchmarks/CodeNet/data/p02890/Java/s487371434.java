import java.io.PrintWriter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        int n = nextInt();

        for(int i = 0; i < n; i++){
            int a = nextInt();
            if (map.containsKey(a)) {
            	int num = map.get(a);
            	map.remove(a);
            	map.put(a, num + 1);
            } else {
            	map.put(a, 1);
            }
        }

        println(n);

        for (int k = 2; k <= n; k++) {
        	Queue<Integer> queue = new PriorityQueue<Integer>(map.size(), new MyComparator());
            for (Integer value : map.values()) {
            	queue.add(value);
            }
        	int count = 0;
        	for (int i = 1; i <= n / k; i++) {
        		if (eat(k, queue)) {
        			count += 1;
        		}
        	}
        	println(count);
        }


    }

    static int nextInt() {
        return Integer.parseInt(next());
    }

    static String next() {
        return sc.next();
    }

    static String nextLine(){
        return sc.nextLine();
    }

    static void println(Object o) {
        out.println(o);
        out.flush();
    }

    static boolean eat(int num, Queue<Integer> queue) {
    	if (queue.size() < num) {
    		return false;
    	}

    	int[] aaa = new int[num];

    	for (int i = 0; i < num; i++) {
    		aaa[i] = queue.poll();
    	}
    	for (int i = 0; i < num; i++) {
    		if (aaa[i] > 1) {
    			queue.add(aaa[i] - 1);
    		}
    	}

    	return true;
    }

    static class MyComparator implements Comparator<Object> {
	    public int compare(Object obj1, Object obj2) {

	        int num1 = (int)obj1;
	        int num2 = (int)obj2;

	        if(num1 < num2) {
	            return 1;
	        } else if(num1 > num2) {
	            return -1;
	        } else{
	            return 0;
	        }
	    }
	}
}