import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main{
	public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	long count=0;
	long ans=0;
	int AB[][]=new int[a][2];
	for(int i=0;i<a;i++) {
		int x=scan.nextInt();
		int y=scan.nextInt();
		AB[i][0]=x;
		AB[i][1]=y;
	}
	  Arrays.sort(AB, new Comparator<int[]>() {
	        @Override
	        public int compare(int[] o1, int[] o2) {
	            return o1[0] - o2[0];
	        }
	    });
	  for(int i=0;i!=a;i++) {
		  if((count+AB[i][1])>b) {
			  ans+=AB[i][0]*(b-count);
			  break;
		  }
		  else {
			  count+=AB[i][1];
			  ans+=AB[i][0]*AB[i][1];
		  }
	  }
	  System.out.println(ans);
	}
}