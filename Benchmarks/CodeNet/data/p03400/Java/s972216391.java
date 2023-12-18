import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
        int a[] = new int[100];
        
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        int s = x;
        
        for(int i = 0; i < n; i++)
        {
        	s += (d + a[i] - 1) / a[i];
        }
        
        System.out.println(s);
	}
}