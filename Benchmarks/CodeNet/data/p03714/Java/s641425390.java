
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());
	List<Num> list = new ArrayList<Num>(3*N);
	
	for (int i = 0; i < 3*N; i++) {
	    list.add(new Num(i, Long.parseLong(scan.next())));
	}

	Collections.sort(list.subList(0, 2*N), new Comparator<Num>() {
		public int compare(Num num1, Num num2) {
		    return (int)(num2.value() - num1.value());
		}
	    });

	long first = 0;
	int index = -1;
	for (int i = 0; i < N; i++) {
	    first += list.get(i).value();
	    index = list.get(i).index() > index ? list.get(i).index() : index;
	}
	Collections.sort(list.subList(0, 2*N), new Comparator<Num>() {
		public int compare(Num num1, Num num2) {
		    return num1.index() - num2.index();
		}
	    });
	Collections.sort(list.subList(index+1, 3*N), new Comparator<Num>() {
		public int compare(Num num1, Num num2) {
		    return (int)(num2.value() - num1.value());
		}
	    });
	long second = 0;
	for (int i = 2*N; i < 3*N; i++) {
	    second += list.get(i).value();
	}
	System.out.println(first-second);
	scan.close();
    }

}

class Num {
    private int index;
    private long value;

    Num(int index, long value) {
	this.index = index;
	this.value = value;
    }

    public int index() {
	return index;
    }

    public long value() {
	return value;
    }
}
