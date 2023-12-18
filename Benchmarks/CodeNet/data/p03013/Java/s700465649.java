import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	int first=0,last=-1,toNext;
	int countAll = 1;
	int count = 0;
	int[] a = new int[m];
	for (int i=0; i<m; i++) a[i] = sc.nextInt();
	for (int i=0; i<=m; i++) {
	    first = last + 1;
	    if (i != m) last = a[i];
	    else { last = n + 1; }
	    if (last == first) { countAll = 0; break; }
	    toNext = last - 1 - first;
	    if (toNext%2 == 1) {
		for (int one=1; one<=toNext; one+=2) {
		    int two = (toNext - one)/2;
		    count += kai(toNext,one,two);
		}
	    } else {
		for (int one=0; one<=toNext; one+=2) {
		    int two = (toNext - one)/2;
		    count += kai(toNext,one,two);
		}
	    }
	    countAll = (countAll * count) % 1000000007;
	    count = 0;
	}
	System.out.print(countAll);
    }
    static int kai(int all,int one,int two) {
	if (one == 0 || two == 0) {
	    return 1;
	} else {
	    int allIs=1,oneIs=1,twoIs=1;
	    for (int i=1; i<=all; i++) allIs *= i;
	    for (int i=1; i<=one; i++) oneIs *= i;
	    for (int i=1; i<=two; i++) twoIs *= i;
	    return allIs / (oneIs * twoIs);
	}
    }
}
