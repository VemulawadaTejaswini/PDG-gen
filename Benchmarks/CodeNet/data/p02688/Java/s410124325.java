import java.util.Scanner;
public class Main {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[]d = new int[K];
    int[]A = new int[K];
    int[]sunuke = new int[N];
    
    for(int i=0; i<K; i++) {
    	d[i] = sc.nextInt();
    	for(int j=0; j<d[i]; j++) {
    		A[j] = sc.nextInt();
    		sunuke[j]++;
    	}
    }
    int ans = 0;
    for(int j=0; j<N; j++) {
    if(sunuke[j]==0) {
    	ans++;
    }
    }    		 
    System.out.println(ans);
    }
}

