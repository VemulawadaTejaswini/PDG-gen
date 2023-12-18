import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long a[]=new long[N];
        long b[]=new long[N];
        long c[]=new long[N];
        for(int i=0; i<N; i++){
            a[i]=sc.nextLong();
        }
        for(int i=0; i<N; i++){
            b[i]=sc.nextLong();
        }
        for(int i=0; i<N; i++){
            c[i]=sc.nextLong();
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        
        int aCount=0;
        int cCount=0;
        long res=0;

        int ok;
        int ng;
        int h;

        for(int i=0; i<N; i++){
            ok=-1;
            ng=N;
            
            while(ng-ok>1){
                h=(ok+ng)/2;
                if(a[h]<b[i]){
                    ok=h;
                }else{
                    ng=h;
                }
            }

            aCount = ok+1;

            ok=N;
            ng=-1;
            
            while(ok-ng>1){
                h=(ok+ng)/2;
                if(c[h]>b[i]){
                    ok=h;
                }else{
                    ng=h;
                }
            }

            cCount = N-ok;

            res = res + aCount * cCount;

        }
        
        
        
        
        System.out.println(res);
        }
    }
