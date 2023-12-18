import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] L=new int[N];
        for(int i=0; i<N; i++){
            L[i]=sc.nextInt();
        }
        long res = 0;

        Arrays.sort(L);

        for(int i=N-1; i>1; i--){
            for(int j=0; j<i-1; j++){
                int ok=i;
                int ng=j;
                while(ok-ng>1){
                    int h=(ok+ng)/2;
                    if(L[i]<L[j]+L[h]){
                        ok = h;
                    }else{
                        ng = h;
                    }
                }
                res = res + i - ok;
            }
        }
        System.out.println(res);
        
        }
    }