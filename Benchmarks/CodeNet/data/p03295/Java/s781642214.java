import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] remove = new int[n];
		List<int[]> list = new ArrayList<>();
		for(int i=0;i<m;i++) {
			int begin = in.nextInt();
			int end = in.nextInt();
			if(end-begin==1) {
				remove[begin] = 1;
			}else {
				int[] a = new int[n];
				for(int j=begin;j<end;j++) {
					a[j] = 1;
				}
				list.add(a);
			}
		}
		
		for(int i=0;i<n;i++) {
			if(remove[i]==1) {
				delete(list,i);
			}
		}
		
		int min = Integer.MAX_VALUE;
		
		while(!list.isEmpty()) {
			int[] total = new int[n];
			for(int[] a : list) {
				for(int i=1;i<n;i++) {
					total[i] += a[i];
				}
			}
			List<Integer> maxIdx = getMax(total);
			delete(list,maxIdx.get(0));
			remove[maxIdx.get(0)] = 1;
		}
			int sum = 0;
			for(int i=0;i<n;i++) {
				sum += remove[i];
			}
			if(sum<min) min=sum;
		
		
		
		System.out.println(min);
	}
	
	public static List<Integer> getMax(int[] total){
		int max = 0;
		for(int i=0;i<total.length;i++) {
			if(total[i]>max) {
				max = total[i];
			}
		}
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<total.length;i++) {
			if(total[i]==max) {
				list.add(i);
			}
		}
		return list;
	}
	
	public static void delete(List<int[]> list,int idx){
		for(int i=0;i<list.size();i++) {
			int[] a = list.get(i);
			if(a[idx]==1) {
				list.remove(i);
				i--;
			}
		}
	}
}
