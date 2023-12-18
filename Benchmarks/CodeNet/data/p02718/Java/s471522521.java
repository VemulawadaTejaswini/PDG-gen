import java.util.*;
public class Main{
public static void main(String[] args) throws Exception{
    	Scanner sc = new Scanner(System.in);
     	int n,m;
       	n = sc.nextInt();
       	m = sc.nextInt();
       	int arr[] = new int[n];
       	int count = 0;
       	for(int i = 0; i < n; i++)
       	{
       		arr[i] = sc.nextInt();
       		count += arr[i];
       	}
       	Arrays.sort(arr);
       	int cutoff = count / (4 * m);
       	int c = 0;
       	for(int i = n - 1; i >= 0; i--)
       	{
       		if(cutoff < arr[i])
       			c++;
       		else
       			break;
       	}
       	if(c >= m)
       		System.out.println("Yes");
       	else
       		System.out.println("No");
       	

    }
}