import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class Solver extends Main{
	Solver(){
		
	}
}//Solver_end

@SuppressWarnings("unchecked")
class Main{
	static int imax=Integer.MAX_VALUE;
	static long lmax=Long.MAX_VALUE;
	
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner sc=new Scanner(System.in);
		
		long n=readL(sc);
		long[] num=readlnL(sc," ");
		List<Long> bnum=new LinkedList();
		int dir=0;
		
		for(int i=0; i<num.length; i++){
			if(dir==0){
				bnum.add(num[i]);
			}else{
				bnum.add(0,num[i]);
			}
			dir= dir==0 ? 1 : 0;
		}
		
		if(n%2==1){
			Collections.reverse(bnum);
		}
		
		StringBuilder ans=new StringBuilder();
		
		for(int i=0; i<n-1; i++){
			ans.append(Long.toString(bnum.get(i))+" ");
		}
		
		ans.append(Long.toString(bnum.get(bnum.size()-1)));
		
		puts(ans);
	}//main_end
	
//---------------------------------------------------------------------------
	static int readI(Scanner sc){
		return Integer.parseInt(sc.nextLine().trim());
	}
	static long readL(Scanner sc){
		return Long.parseLong(sc.nextLine().trim());
	}
	static String readS(Scanner sc){
		return sc.nextLine().trim();
	}
	static int[] readlnI(Scanner sc, String dl){
		return Arrays.stream(sc.nextLine().trim().split(dl)).mapToInt(Integer::parseInt).toArray();
	}
	static long[] readlnL(Scanner sc, String dl){
		return Arrays.stream(sc.nextLine().trim().split(dl)).mapToLong(Long::parseLong).toArray();
	}
	static String[] readlnS(Scanner sc, String dl){
		return sc.nextLine().trim().split(dl);
	}
	@SuppressWarnings("unchecked")
	static <T> void puts(T... args){
		for(int i=0; i<args.length-1; i++){
			System.out.printf("%s ",args[i]);
		}
		System.out.println(args[args.length-1]);
	}
	static void puts(int[] ary){
		for(int i=0; i<ary.length-1; i++){
			System.out.printf("%d ",ary[i]);
		}
		System.out.println(ary[ary.length-1]);
	}
	static void puts(long[] ary){
		for(int i=0; i<ary.length-1; i++){
			System.out.printf("%d ",ary[i]);
		}
		System.out.println(ary[ary.length-1]);
	}
	static void bs(){
		System.out.println("");
	}
	static int sum(int[] ary){
		int sum=0;
		for(int i=0; i<ary.length; i++) sum+=ary[i];
		return sum;
	}
	static long sum(long[] ary){
		long sum=0;
		for(int i=0; i<ary.length; i++) sum+=ary[i];
		return sum;
	}
	static void tblSort(int[][] tbl){
		Arrays.sort(tbl, new Comparator<int[]>(){
			@Override
			public int compare(int[] a, int[] b){
				if(a[0]==b[0]){
					return b[1]-a[1];
				}else{
					return b[0]-a[0];
				}
			}
		});
	}
}
