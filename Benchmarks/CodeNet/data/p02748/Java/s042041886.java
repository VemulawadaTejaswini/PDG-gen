import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
      int b = scn.nextInt();
      int m = scn.nextInt();
		int[] a = new int[a];
		for(int i=0; i<a.length; ++i){
			a[i] = scn.nextInt();
		}
      int[] b = new int[a];
		for(int i=0; i<b.length; ++i){
			b[i] = scn.nextInt();
		}  
	}
}
//一旦保存