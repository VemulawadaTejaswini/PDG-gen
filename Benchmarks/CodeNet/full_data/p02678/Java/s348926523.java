import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt(),m=sc.nextInt();
	  int[][] a=new int[n][n];
	  int[] res=new int[n];
	  for(int i=0;i<m;i++) {
		  int buff1=sc.nextInt()-1,buff2=sc.nextInt()-1;
		  a[buff1][buff2]++;
		  a[buff2][buff1]++;
	  }

	  /*for(int[] i:a) {
		  for(int j:i) {
			  System.out.print(j);
		  }
		  System.out.println();
	  }*/
	ArrayDeque<Integer> dq = new ArrayDeque<>();
	dq.add(1);
	//幅優先探索
	int d=1;
	while (dq.size() > 0) {
		//Queueの先頭の座標を取り出し＆削除して、その四方を探索する。
		int p = dq.removeFirst();
		for (int i=0; i<n; i++) {
			if(a[p-1][i]==1) {
				dq.add(i+1);
				if(res[i]==0)res[i]=p;
			}
			a[i][p-1]=0;
		}
		System.out.println(Arrays.toString(res));
	}
	System.out.println("yes");
	for(int i=1;i<n;i++) {
		System.out.println(res[i]);
	}
  }
}