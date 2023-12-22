import java.util.Scanner;

public class Main {
    static int cost = 0;
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	int[] w = new int[n];
	String[] inputA = scan.nextLine().split(" ");
	for (int i = 0; i < n; i++) {
	    w[i] = Integer.parseInt(inputA[i]);
	}
	sort(w, 0, n-1);
	System.out.println(cost);
    }
    static int partition (int[] a, int left, int right) {
	int middleIndex = findmiddle(a, left, right);
	int x = a[middleIndex];
	int i = left;
	int j = right;
	int tmp;
	while (true) {
	    while(a[i] < x) {
		i++;
	    }
	    while(a[j] > x) {
		j--;
	    }
	    if (i >= j) {
		break;
	    }
	    cost += a[i] + a[j];
	    tmp = a[i];
	    a[i] = a[j];
	    a[j] = tmp;
	    i++;
	    j--;
	}
	return i;
    }
    static void sort (int[] a, int left, int right) {
	if (left < right) {
	    int q = partition(a, left, right);
	    sort(a, left, q-1);
	    sort(a, q+1, right);
	}
    }
    static int findmiddle (int[] array, int left, int right) {
	int a = array[left];
	int b = array[(left+right) / 2];
	int c = array[right];
	if (a <= b) {
	    if (c < a) return left;
	    else if (b < c) return (left + right)/2;
	    else return right;
	}
	else { // a > b
	    if (c < b) return left;
	    else if (a < c) return (left + right)/2;
	    else return right;
	}
    }
}