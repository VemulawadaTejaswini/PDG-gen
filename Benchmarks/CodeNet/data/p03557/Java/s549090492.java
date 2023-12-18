import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        long[] a = new long[N];
        for(int i=0; i<N; i++){
            a[i]=sc.nextLong();
        }
        long[] b = new long[N];
        for(int i=0; i<N; i++){
            b[i]=sc.nextLong();
        }
        long[] c = new long[N];
        for(int i=0; i<N; i++){
            c[i]=sc.nextLong();
        }
        Arrays.sort(a);
        Arrays.sort(c);

        
        int cCount;
        int aCount;
        long sum = 0;
        for(int j=0; j<N; j++){
            int ok = N;
            int ng = -1;
            while(ok-ng>1){
                int h = (ok+ng)/2;
                if(c[h]>b[j]){
                    ok = h;
                }else{
                    ng = h;
                }

            }
            cCount = N-ok;
            
            ok = -1;
            ng = N;    
            while(ng-ok>1){
                int h = (ok+ng)/2;
                if(a[h]>=b[j]){
                    ng = h;
                }else{
                    ok = h;
                }

            }
            aCount = ok+1;
            sum = sum + aCount*cCount;
        }
        

        
        System.out.println(sum);
        }
    }
