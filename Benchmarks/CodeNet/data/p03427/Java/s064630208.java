import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        long N=sc.nextLong(),D=(int)Math.log10(N),a=0,M=N;
        for(int i=0;i<D;i++){
            if(M%10!=9){
                a--;
                break;
            }
            M/=10;
        }
        a+=N/(long)Math.pow(10,D);
        System.out.println(9*D+a);
    }
}