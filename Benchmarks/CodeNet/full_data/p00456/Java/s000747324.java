import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[10];
		for(int i=0;i<10;++i) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<10;++i) {
			b[i]=sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
//		int i=1,end=10;     // 初期位置と終了位置を調べる
//		while(i<end){                 // 終了位置未満の間
//			if(a[i-1]>a[i]){  // 昇順(>)、降順(<） 
//				swap(a, i);  // swap
//				i--;                  // ソートした場合は左で1つずれる
//				if(i==0) i+=2;        // 地点0になった場合は位置を2加算
//			} else {                  // ソートの必要が無い場合は右へ1つずれる
//				i++;
//			}
//		}
//		i=1;
//		while(i<end){                 // 終了位置未満の間
//			if(b[i-1]>b[i]){  // 昇順(>)、降順(<） 
//				swap(b, i);  // swap
//				i--;                  // ソートした場合は左で1つずれる
//				if(i==0) i+=2;        // 地点0になった場合は位置を2加算
//			} else {                  // ソートの必要が無い場合は右へ1つずれる
//				i++;
//			}
//		}
		System.out.println(Integer.toString(a[7]+a[8]+a[9])+' '+Integer.toString(b[7]+b[8]+b[9]));
	}

	public final static void swap(int[] array, int i) {
		int n=array[i-1]; array[i-1]=array[i]; array[i]=n;
	}
	
	public final static void swap2(int[] array, int i, int j) {
		int n=array[j]; array[j]=array[i]; array[i]=n;
	}
	
	public final static void swap_heap(int[] array, int i){
		int n=array[i]; array[i]=array[0]; array[0]=n;
	}
	
}
