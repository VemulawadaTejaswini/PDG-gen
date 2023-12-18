import java.util.*;
public class Mohammad {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
	int[] a = new int[n + 1];
	int[] b = new int[n];
	for(int i=0; i<n+1; i++)
            a[i] = sc.nextInt();
	for(int i=0; i<n; i++)
            b[i] = sc.nextInt();
	int s = 0;
        for(int i=0; i<n; i++){
            if(a[i]>b[i])
                s += b[i];
            else {
                s += a[i];
                int temp = a[i + 1];
                a[i + 1] -= b[i] - a[i];
		a[i + 1] = Math.max(a[i + 1], 0);
		s += temp - a[i + 1];
            }
        }
        System.out.println(s);
    }
}