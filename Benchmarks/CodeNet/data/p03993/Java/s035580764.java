import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; ++i){
			a[i] = scn.nextInt();
		}
      	int count = 0;
      	for(int i=0; i<a.length; ++i){
          if(a[a[i-1]]==i-1) count++;
        }
      	System.out.println(count);
	}
}
