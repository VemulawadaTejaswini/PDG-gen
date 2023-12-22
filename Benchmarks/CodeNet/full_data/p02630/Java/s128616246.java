import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a=new int[N];
        int[] count=new int[(int)Math.pow(10,5)];
        long res = 0;

        for(int i=0; i<N; i++){
            a[i]=sc.nextInt();
            count[a[i]]++;
            res = res + (long)a[i];
        }

        int Q = sc.nextInt();
        
        for(int i=0; i<Q; i++){
            int b=sc.nextInt();
            int c=sc.nextInt();
            res = res + (c-b)*count[b];
            count[c] += count[b];
            count[b] = 0;
            System.out.println(res);
        }

        
        
        
        
        
        
        
        
        
        }
    }