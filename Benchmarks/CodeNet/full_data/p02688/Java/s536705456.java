import java.util.HashSet;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int d[] = new int[k];
        HashSet<Integer> result = new HashSet<Integer>();
        for(int i=0;i<k;i++) {
        	d[i]=sc.nextInt();
        	int a[] = new int[d[i]];
        	for(int j=0;j<d[i];j++) {
        		a[j] = sc.nextInt();
        		result.add(a[j]);
        	}
        }
        System.out.println(n-result.size());
    	sc.close();
	}
}