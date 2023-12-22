import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KPCMain {
	public Scanner scanner = new Scanner(System.in);
	public static final long MODN = 1000000007;
	public PrintStream out = System.out;
	
	public void start() {
		long n = scanNum();
		long[] a = scanNums(n);
		
		long sum1 = 0;
		long sum2 = 0;
		
		for(int i=0; i < n; i++) {
			sum2 += sum1 * a[i];
			sum2 %= MODN;
			sum1 += a[i];
			sum1 %= MODN;
		}
		
		out.print(sum2);
	}
	
	//Javaではlong型でも%dでよい
	public void printNums(long[] nums) { for(long cur : nums) out.printf("%d ", cur); out.println();}
	public void printNums(List<Long> nums) { for(long cur : nums) out.printf("%d ", cur); out.println();}
	public long scanNum() { return scanner.nextLong(); }
	public String scanLine() { return scanner.nextLine(); }
	
	public long[] scanNums(long num) {
		long[] ret = new long[(int) num];
		for(int i=0; i < num; i++) {
			ret[i] = scanner.nextLong();
		}
		return ret;
	}
	
	public List<Long> longArrayToList(long[] arr){
		List<Long> ret = new ArrayList<>(arr.length);
		for(long cur : arr) {
			ret.add(cur);
		}
		return ret;
	}
	
	public KPCMain() {
		
	}
	
	public static void main(String[] args) {
		KPCMain kpc = new KPCMain();
		kpc.start();
	}

}
