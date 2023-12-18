

import java.io.*;
import java.util.*;

class Exec extends Main{
	void solve(){
	}
}

class Main{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc=new Scanner(System.in);
		Exec exe=new Exec();
		int[] n=readsI(sc, " ");
		int a=n[0], b=n[1];
		int l=10;
		boolean game=true;
		int win=0;
		
		while(game==true && l>0){
			if(a>1 && game==true){
				if(a%2==0){
					b+=(a-2)/2;
					a=2;
				}else if(a%2==1){
					b+=(a-1)/2;
					a=1;
				}
			}else{
				game=false;
				win=1;
			}
			puts(a,b,0);
			if(b>1 && game==true){
				if(b%2==0){
					a+=(b-2)/2;
					b=2;
				}else if(b%2==1){
					a+=(b-1)/2;
					b=1;
				}
			}else{
				game=false;
				win=0;
			}
			l-=1;
		}
		puts(win==0 ? "Alice":"Brown");
	}


	
	
	
	
	
	
	
	
	//utility
	static int[] readsI(Scanner sc, String dl){
		return Arrays.stream(sc.nextLine().trim().split(dl)).mapToInt(Integer::parseInt).toArray();
	}
	static String[] readsS(Scanner sc, String dl){
		return sc.nextLine().trim().split(dl);
	}
	static int readI(Scanner sc){
		return Integer.parseInt(sc.nextLine().trim());
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








