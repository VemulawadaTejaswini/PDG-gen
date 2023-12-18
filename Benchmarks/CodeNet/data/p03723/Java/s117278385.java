import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class Solver extends Main{
	Solver(long a, long b, long c){
		long[] cur={a,b,c};
		long[] nex={0,0,0};
		long s=a+b+c;
		boolean con=true;
		boolean loop=false;
		int i=0;
		
		while(con==true){
			nex[0]=(s-cur[0])/2;
			nex[1]=(s-cur[1])/2;
			nex[2]=(s-cur[2])/2;
			
			//puts(nex[0],nex[1],nex[2],s);
			
			cur[0]=nex[0];cur[1]=nex[1];cur[2]=nex[2];
			nex[0]=0; nex[1]=0; nex[2]=0;
			if(cur[0]%2==1 || cur[2]%2==1 || cur[2]%2==1) con=false;
			if((s-cur[0])/2==cur[0] && (s-cur[1])/2==cur[1] &&(s-cur[2])/2==cur[2]){
				con=false;
				loop=true;
			}
			i+=1;
		}
		puts(i);
	}
}

class Main{
	int imax=Integer.MAX_VALUE;
	long lmax=Long.MAX_VALUE;
	public static void main(String[] args) throws FileNotFoundException{

		Scanner sc=new Scanner(System.in);
		long[] data=readlL(sc," ");
		new Solver(data[0], data[1], data[2]);
	}	
	
	//utility
	static int[] readI(Scanner sc, String dl){
		return Arrays.stream(sc.nextLine().trim().split(dl)).mapToInt(Integer::parseInt).toArray();
	}
	static int[] readlI(Scanner sc, String dl){
		return Arrays.stream(sc.nextLine().trim().split(dl)).mapToInt(Integer::parseInt).toArray();
	}
	static long[] readlL(Scanner sc, String dl){
		return Arrays.stream(sc.nextLine().trim().split(dl)).mapToLong(Long::parseLong).toArray();
	}
	static int nextI(Scanner sc){
		return Integer.parseInt(sc.nextLine().trim());
	}
	static String[] readS(Scanner sc, String dl){
		return sc.nextLine().trim().split(dl);
	}
	static String nextS(Scanner sc){
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
	static void puts(long[] ary){
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
					return b[1]-a[1];
				}else{
					return b[0]-a[0];
				}
			}
		});
	}
}