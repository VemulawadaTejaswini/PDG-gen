import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	/* 入力 */
	int n = scan.nextInt();
	int m = scan.nextInt();
	int[] l = new int[m];
	int[] r = new int[m];
	for(int i = 0; i < m; i++){
	    l[i] = scan.nextInt();
	    r[i] = scan.nextInt();
	}

	/* lの最大値 rの最小値 */
	Arrays.sort(l);
	Arrays.sort(r);
	if(r[0]-l[m-1]+1 < n){
	    System.out.println(r[0]-l[m-1]+1);
	}else{
	    System.out.println(n);
	}
    }
}
