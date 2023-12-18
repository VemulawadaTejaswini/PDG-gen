
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

	int N = 0;
	int K = 0;
	List<MyClass> list = null;
	N = Integer.parseInt(scan.next());
	
	try {
	    K = Integer.parseInt(scan.next());
	} catch(Exception e) {
	    System.out.println(0);
	    System.exit(0);
	}
	list = new ArrayList<MyClass>();

	for (int i = 0; i < N; i++) {
	    int a = Integer.parseInt(scan.next());
	    int b = Integer.parseInt(scan.next());

	    list.add(new MyClass(a, b));
	}
	Collections.sort(list);
	    
	int num = 0;
	int ans = 0;
	for(MyClass l: list) {
	    num += l.b;
	    if(num >= K) {
		ans = l.a;
		break;
	    }
	}
	System.out.println(ans);
	scan.close();
    }
}

class MyClass implements Comparable<MyClass> {

    int a;
    int b;

    MyClass(int a, int b) {
	this.a = a;
	this.b = b;
    }

    @Override
    public int compareTo(MyClass o) {
	return a - o.a;
    }
}
