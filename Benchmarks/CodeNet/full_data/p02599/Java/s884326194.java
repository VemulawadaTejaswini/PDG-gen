
import java.util.*;

public class Main{
	public static void main(String args[]){
     	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int q = sc.nextInt();
        int ar[] = new int[n+1];
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<n;i++){
           ar[i] = sc.nextInt();
        }
        for(int i =0;i<q;i++){
        	int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==b)
            	System.out.println(1);
            else{
            	set = new HashSet<>();
            	for(int j =a-1;j<b;j++)
            		set.add(ar[j]);
            	System.out.println(set.size());
            }
           
        }
    }
}
