import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	int[] ary = new int[M];
    	int[] ary2 = new int[M-1];
    	for(int i = 0; i < M; i++){
    		ary[i] = sc.nextInt();
    	}
    	sc.close();
    	Arrays.sort(ary);
    	for(int i = 0; i < M-1; i++){
    		ary2[i] = Math.abs(ary[i] - ary[i+1]);
    	}
    	Arrays.sort(ary2);
    	int ans = 0;
    	for(int i = 0; i < (M - N); i++){
    		ans += ary2[i];
    	}
    	System.out.println(ans);
    }
}
