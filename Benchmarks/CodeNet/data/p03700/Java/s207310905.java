
import java.util.*;
public class Main {
    static int A,B,N,hmax;
    static int[] h;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        h = new int[N];
        int sum = 0;
        hmax=0;
        for(int i = 0; i<N; i++){
            h[i] = sc.nextInt();
            if(h[i] > hmax)
                hmax=h[i];
        }
        int T=hmax/B+2;
        int err=T;
        int h=T;
        int l = 1;        
        int mid = (h+l)/2;
        while(true){
        //    System.out.println(h + " " + mid + " " + l);
            if(Math.abs(err)==0)
                break;
            if(isSol(mid)){
                h=mid;
            }else{
                l = mid+1;
            }
            err=h-l;
            mid=(h+l)/2;
        }
        System.out.println(h);

    }
    static boolean isSol(int T){
        if(func(T)>=0){
            return true;
        }else{
            return false;
        }
    }
    static int func(int n){
        double sum = 0;
        for(int i = 0; i <h.length;i++ ){
            sum += (Math.ceil(((double)h[i]-(double)B*n)/(A-B)));
        }
        return n-(int)(sum);
    }

}
