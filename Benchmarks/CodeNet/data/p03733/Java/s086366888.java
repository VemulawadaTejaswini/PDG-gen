import java.io.*;
import java.util.*;


class Main{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc=new Scanner(System.in);
		long[] data=readlI(sc," ");
		long n=data[0], t=data[1];
		long[] w=data=readlI(sc," ");
		long to=0,sum=0;
		for(int i=0; i<w.length; i++){
			sum+=t;
			if(to>w[i]){
				sum-=to-w[i];
				to=w[i];	
			}
			to+=t;
		}
		puts(sum);
	}

	
	//utility
	static long[] readlI(Scanner sc, String dl){
		return Arrays.stream(sc.nextLine().trim().split(dl)).mapToLong(Long::parseLong).toArray();
	}
	static int readI(Scanner sc){
		return Integer.parseInt(sc.nextLine().trim());
	}
	static String[] readlS(Scanner sc, String dl){
		return sc.nextLine().trim().split(dl);
	}
	static String resadS(Scanner sc){
		return sc.nextLine().trim();
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
	static void tblSort(int[][] tbl){
		Arrays.sort(tbl, new Comparator<int[]>(){
			@Override
			public int compare(int[] a, int[] b){
				if(a[0]==b[0]){
					return a[1]-b[1];
				}else{
					return a[0]-b[0];
				}
			}
		});
	}
}
