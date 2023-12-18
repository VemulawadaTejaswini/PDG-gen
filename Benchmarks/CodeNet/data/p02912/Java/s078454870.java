import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		PriorityQueue <Integer>d=new PriorityQueue<Integer>(new MyComparator());
		int N=stdIn.nextInt();
		int M=stdIn.nextInt();
		int A[]=new int[N];
		int z=0;
		long ans=0;
		while(z<N){
			int a=stdIn.nextInt();
			d.add(a);
			z++;
		}z=0;
		while(z<M){
			int a=d.poll();
			a/=2;
			d.add(a);
			z++;
		}z=0;
		while(z<N){
			ans+=d.poll();
			z++;
		}
		System.out.println(ans);
	}
}
class MyComparator implements Comparator {
	 
    public int compare(Object obj1, Object obj2) {
         
        int num1 = (int)obj1;
        int num2 = (int)obj2;
         
        if(num1 < num2) {
            return 1;
        } else if(num1 > num2) {
            return -1;
        } else{
            return 0;
        }
    }
}