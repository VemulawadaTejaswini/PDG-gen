import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int[]m = new int[N];
 
    int all = 0;
    for(int i=0; i<N; i++){
        m[i] = sc.nextInt();
        	all +=  m[i];
}
    int a = X-all;
    Arrays.sort(m);
    
	System.out.println(a/m[0]+N);
    }
}
