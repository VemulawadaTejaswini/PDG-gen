import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Main {

    public static long calc(int n) {
	n--;
	return (long)(n * (1 + n) / 2);
    }
    
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();
	String S[] = new String[N];
	for (int i = 0; i < N; i++) {
	    char c[] = (sc.next()).toCharArray();
	    Arrays.sort(c);
	    S[i] = String.valueOf(c);
	}

	Arrays.sort(S);

	List<Integer> list = new ArrayList<Integer>();
	int max = 1;
	for (int i = 1; i < N; i++) {
	    if (S[i - 1].equals(S[i])) {
		max++;
	    } else {
		if (max != 1)
		    list.add(max);
		max = 1;
	    }
	}
	if (max != 1)
	    list.add(max);
	
	long count = 0;
	for (int i = 0; i < list.size(); i++) {
	    count += calc(list.get(i));
	}

	System.out.println(count);
    }
}