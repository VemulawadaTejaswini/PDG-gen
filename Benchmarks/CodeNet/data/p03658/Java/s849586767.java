import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main
{
    int n, k;
    Integer[] l = new Integer[51];
    
    public static void main(String args[])
    {
	new Main().run();
    }
    
    void run()
    {
	in();

	Arrays.sort(l, 0, n, Comparator.reverseOrder());

	int sum = 0;
	for(int i = 0; i < k; i++) sum += l[i];
		
	out(sum);
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	k = sc.nextInt();
	for(int i = 0; i < n; i++) l[i] = sc.nextInt();
    }

    void out()
    {
	
    }
    
    void out(int ans)
    {
	System.out.println(ans);
    }
}
