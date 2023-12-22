import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public Scanner scanner = new Scanner(System.in);
	public static final long MODN = 1000000007;
	public PrintStream out = System.out;
	
	public void start() {
		int n = scanInt();
		int m = scanInt();
		
		int[] persons = new int[n];
		List<List<Integer>> groups = new ArrayList<List<Integer>>(n);
		
		for(int i=0; i < n; i++) {
			persons[i] = i;
			List<Integer> tmp = new ArrayList<Integer>();
			tmp.add(i);
			groups.add(tmp);
		}
		
		for(int i=0; i < m; i++) {
			int a = scanInt() - 1;
			int b = scanInt() - 1;
			
			if(persons[a] == persons[b]) continue;
			
			int pb = persons[b];
			List<Integer> groupa = groups.get(persons[a]);
			List<Integer> groupb = groups.get(persons[b]);
			
			for(int cur : groupb) {
				groupa.add(cur);
				persons[cur] = persons[a];
			}
			
			groups.set(pb, null);
		}
		
		int max = 1;
		for(List<Integer> cur : groups) {
			if(cur != null) {
				if(cur.size() > max) max = cur.size();
			}
		}
		
		out.print(max);
	}
	
	//Javaではlong型でも%dでよい
	public void printNums(long[] nums) { for(long cur : nums) out.printf("%d ", cur); out.println();}
	public void printNums(List<Long> nums) { for(long cur : nums) out.printf("%d ", cur); out.println();}
	public long scanNum() { return scanner.nextLong(); }
	public int scanInt() { return scanner.nextInt(); }
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
	
	public Main() {
		
	}
	
	public static void main(String[] args) {
		Main kpc = new Main();
		kpc.start();
	}

}
