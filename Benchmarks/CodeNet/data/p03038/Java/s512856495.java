import java.util.Scanner;
public class Main {
	 public static void main(String args[]){
		 Scanner std = new Scanner(System.in);
		 int n = std.nextInt();
		 int m = std.nextInt();
		 long[] ai = new long[n];
		 long[][] bc = new long[m][2];

		 for(int i=0;i<n;i++) {
			 ai[i]=std.nextInt();
		 }
		 for(int i=0;i<m;i++) {
			 bc[i][0]= std.nextLong();
			 bc[i][1]=std.nextLong();
		 }
		 for (int i = 0; i < m - 1; i++) {
	            for (int j = m - 1; j > i; j--) {
	                if (bc[j - 1][1] < bc[j][1]) {
	                    // 入れ替え
	                    long[] tmp = bc[j - 1];
	                    bc[j - 1] = bc[j];
	                    bc[j] = tmp;
	                }
	             }
	     }

		 sort(ai);

		 for(int i=0;i<m;i++) {
			 long b = bc[i][0];
			 long c =bc[i][1];
			 for(int j=0;j<b;j++) {
				 if(ai[j]<c) {
					 ai[j]=c;
				 }
			 }

			 sort(ai);
		 }
		 long sum=0;
		 for(int i=0;i<n;i++) {
			 sum += ai[i];
		 }
		 System.out.println(sum);
	 }
	    static void sort(long[] array) {
	        for (int i = 0; i < array.length - 1; i++) {
	            for (int j = array.length - 1; j > i; j--) {
	                if (array[j - 1] > array[j]) {
	                    // 入れ替え
	                    long tmp = array[j - 1];
	                    array[j - 1] = array[j];
	                    array[j] = tmp;
	                }
	             }
	        }
	    }

}
