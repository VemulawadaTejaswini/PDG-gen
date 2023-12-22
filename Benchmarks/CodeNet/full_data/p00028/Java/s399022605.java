import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int[] a = new int[100];
		int count=0,maxcount=0;
		while(cin.hasNext()){
			a[count++]=cin.nextInt();
		}
		int[] b = new int[count];
		for(int i = 0; i < count;i++){
			b[i]=a[i];
		}
		Arrays.sort(b);
		int[][] hyou = new int[100][2];
		int cnthyou=0;
		for(int i = 0; i < b.length;){
			int dx = 1;
			count=1;
			while(true){
				if(i + dx == b.length){
					break;
				}
				if(b[i] == b[i+dx]){
					dx++;
					count++;
				}
				else{
					break;
				}
			}
			hyou[cnthyou][0]=b[i];
			hyou[cnthyou][1]=count;
			maxcount = Math.max(maxcount, count);
			i += dx;
			cnthyou++;
		}
		for(int i = 0; i < cnthyou; i++){
			if(hyou[i][1]==maxcount){
				System.out.println(hyou[i][0]);
			}
		}
	}

}