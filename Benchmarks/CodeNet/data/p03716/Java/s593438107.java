import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
public class Main
{
	public static void main(String args[])throws IOException {
		BufferedReader br  =new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
	
		String a =br.readLine();
		StringTokenizer st =new StringTokenizer(a);
		int arr[] =new int[3*n];
		PriorityQueue <Integer> quelarge=new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
		PriorityQueue <Integer> que=new PriorityQueue<>();
		for(int i =0;i<3*n;i++) {
		
			arr[i]=Integer.parseInt(st.nextToken());
			if(i<n)
				quelarge.add(arr[i]);
			else 
				que.add(arr[i]);
		}
		int k =n-1;long max=Long.MIN_VALUE;
		
		do {
			k++;
			long m =getlarge(quelarge,n)-getsmall(que,n);
			int ele=arr[k];
			quelarge.add(ele);
			que.remove(ele);
			if(max<m)max=m;
		}while(k<2*n);
		System.out.println(max);
		
	}
	static long getlarge(PriorityQueue<Integer> que,int n) {
		long max=0;
		PriorityQueue <Integer>que1 =new PriorityQueue<>(que);
		
		for(int i=0;i<n;i++) {
			max+=que1.poll();
		}
		return max;
	}
	static long getsmall(PriorityQueue<Integer> que,int n) {
		long max=0;
		PriorityQueue <Integer>que1 =new PriorityQueue<>(que);
		
		for(int i=0;i<n;i++) {
			max+=que1.poll();
		}
		return max;
		
	}
}