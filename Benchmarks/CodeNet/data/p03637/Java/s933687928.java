import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
	static Map<Long,Long> map= new TreeMap<>();
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	   long[] a=new long[n];
	   for(int i=0;i<n;i++)a[i]=sc.nextLong();
	   int count=0,buff=0;
	   for(int i=0;i<n;i++) {
		   if(a[i]%4==0)count++;
		   else if(a[i]%2==0)buff++;
	   }
	   buff=buff/2;
	   count+=buff;
	   if(count>=n/2) {
		   System.out.println("Yes");
	   }else {
		   System.out.println("No");
	   }
  }
	public static Map<Long,Long> primeEnum(long n) {
		for(long i=2;i<=Math.sqrt(n);i++) {
			if(n%i!=0)continue;
			long e=0;
			while(n%i==0) {
				e++;
				n/=i;
			}
			if(map.containsKey(i)) {
				map.put(i, e+map.get(i));
			}else {
				map.put(i, e);
			}
		}
		if(n!=1) {
			if(map.containsKey(n)) {
				map.put(n, 1+map.get(n));
			}else {
				map.put(n, 1L);
			}
		}
		return map;
	}
	public static long GCD(long min,long max) {
		if(max%min==0)return min;
		else return GCD(max%min,min);
	}

	public static boolean prime(long n) {
		if(n==1)return false;
		else if(n==2)return true;
		else if(n%2==0)return false;

		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)return false;
		}
		return true;
	}
}

