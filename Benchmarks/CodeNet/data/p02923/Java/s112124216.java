import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []a=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		ArrayList<Integer>arr=new ArrayList<Integer>();
		for(int i=0;i<n-1;i++) {
			int count=0;
			for(int j=i;j<n-1;j++) {
				if(a[j]>=a[j+1]) {
					count++;
				}
				else {
					arr.add(count);
					break;
				}
				if(j==n-2) {
					arr.add(count);
					break;
				}
			}
		}

		Iterator<Integer>it=arr.iterator();
		int max=arr.get(0);
		while(it.hasNext()) {
			int temp=it.next();
			if(max<temp) {
				max=temp;
			}
		}
		System.out.println(max);
		
	}

}
