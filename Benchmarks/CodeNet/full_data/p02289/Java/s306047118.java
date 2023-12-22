import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
class Main {
  	public static void main(String[] args)throws IOException{
		Scanner scan = new Scanner(System.in);
		int[] A = new int[2000000];
		String end = "end";
		int max = 0;
		int c = 0;
		int m = 0;
		for(;;){
			String meirei = scan.next();
			if(meirei.equals(end)) break;
			
			if(meirei.equals("insert")){
				int n = scan.nextInt();
				A[m] = n;
				m++;
			}else{
				for(int i = 0; i < m + 1; i++){
					if(max < A[i]){
						max = A[i];
						c = i;
					}
				}
				
				System.out.println(max);
				max = 0;
				A[c] = 0;
			}
		}
	}
}