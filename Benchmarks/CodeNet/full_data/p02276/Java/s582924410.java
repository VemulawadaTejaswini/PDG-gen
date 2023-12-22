import java.util.Scanner;
public class Main {
private static Scanner s = new Scanner(System.in);
static int[] a = new int[100001];
public static void main(String[] args) {
	int n = s.nextInt();

	StringBuilder sb = new StringBuilder();

	for(int i = 0;i < n;i++) {
		a[i] = s.nextInt();
	}
	int j = partition(a,0,n-1);
	for(int i = 0;i < n-1;i++) {
		if(i == j) {
			sb.append("[" + a[i] + "] ");
		}else {
		sb.append(a[i]+" ");
		}
	}
	System.out.println(sb.toString() + a[n-1]);
}

public static int partition(int[] a,int p,int r) {
int x = a[r];
int i = p-1;

for(int j = p;j < r;j++) {
	if(a[j] <= x) {
		i++;
		int tmp;
		tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}else {
		int tmp;
	tmp = a[i+1];
	a[i + 1] = a[r];
	a[r] = tmp;
	}
}
return i+1;
}
}
