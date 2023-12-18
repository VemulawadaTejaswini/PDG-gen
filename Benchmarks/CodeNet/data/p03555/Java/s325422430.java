import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n];
        int[] c = new int[n+1];
        long cnt = 0;
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        
        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        
        for(int i=0; i<n; i++){
            c[i] = sc.nextInt();
        }
        Arrays.sort(c);
        
        a[n] = 1_000_000_001;
        c[n] = 1_000_000_001;
        
        long Acnt=0;
        long Ccnt=0;
        
        for(int i=0; i<n; i++){
            while(a[(int)Acnt]<=b[i]) {
                Acnt++;
            }
            while(c[(int)Ccnt]<=b[i]) {
                Ccnt++;
            }
            cnt += Acnt * (n-Ccnt);
        }
        
        System.out.println(cnt);
	}
}