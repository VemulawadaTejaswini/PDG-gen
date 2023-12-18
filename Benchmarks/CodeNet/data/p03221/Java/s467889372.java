import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	static int N,M;
	static Ci[] arr;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new Ci[M]; 
		
		for(int i=0;i<M;i++) {
			int P = sc.nextInt();
			int Y = sc.nextInt();
			arr[i] = new Ci(P,Y,i);
		}
		
		Arrays.sort(arr, new Comparator<Ci>() {
			
			@Override
			public int compare(Ci o1, Ci o2) {
				// TODO Auto-generated method stub
				if(o1.xq>=o2.xq) {
					if(o1.year>o2.year) {
						return 1;
					}else {
						return -1;
					}
				}else {
					return -1;
				}
			}
			
		});
		
		int sort =0;
		for(int i=0;i<arr.length;i++) {
			if(i>0 && arr[i].xq != arr[i-1].xq) {
				sort=0;
			}
			sort++;
			arr[i].id = String.format("%06d", arr[i].xq)+String.format("%06d", sort);
//			System.out.println(arr[i].xq+":"+arr[i].year+":"+arr[i].index+":"+arr[i].id);
		}
		
		Arrays.sort(arr, new Comparator<Ci>() {
			
			@Override
			public int compare(Ci o1, Ci o2) {
				// TODO Auto-generated method stub
				if(o1.index>o2.index) {
					return 1;
				}else {
					return -1;
				}
			}
			
		});
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].id);
		}
	}
	
//	String id1 = String.format("%06d", i+1);
//	String id2 = String.format("%06d", index);
	static class Ci{
		private int xq;
		private int year;
		
		private int index;//原本顺序
		
		public String id;
		
		 
		
		public Ci(int xq, int year, int index) {
			super();
			this.xq = xq;
			this.year = year;
			this.index = index;
		}
		
		 
	}
	 

}
