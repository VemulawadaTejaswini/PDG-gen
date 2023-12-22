import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	static Set<Integer> set=new TreeSet<Integer>();
	static Set<Integer> prime=new TreeSet<Integer>();
	static{
		int[] a={2,5};
		int idx=0;
		int gd=6;
		for(;gd<300000;){
			set.add(gd);
			gd+=a[idx];
			idx=1-idx;
		}
		idx=0;
		for(Integer b:set){
//			System.out.println(b);
			boolean p=true;
			for(Integer c:set){
				if(c*c>b)break;
//				System.out.println("  "+c);
				if(b%c==0&&set.contains(b/c)){
					p=false;
					break;
//					System.out.println(" "+b);
				}
			}
			if(p){
				prime.add(b);
//				System.out.println(b);
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			int n=cin.nextInt();if(n==1)break;
			System.out.print(n+":");
			for(Integer a:set){
				if(n%a==0&&prime.contains(a)){
					System.out.print(" "+a);
				}
			}
			System.out.println();
		}

	}

}