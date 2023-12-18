import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int k = sc.nextInt();
    	long[] ary = new long[n];
    	List<Long> list = new ArrayList<Long>();
    	for(int i = 0; i < n; i++){
    		ary[i] = sc.nextLong();
    	}
    	sc.close();
    	for(int i = 0; i < n-1; i++){
    		for(int j = i+1; j < n; j++){
        		list.add(ary[i] * ary[j]);
        	}
    	}
    	Collections.sort(list);
    	System.out.println(list.get(k-1));
    }
}