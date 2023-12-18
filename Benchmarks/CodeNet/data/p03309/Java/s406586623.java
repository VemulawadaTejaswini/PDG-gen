
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[] a=new int[N];
        for(int i=0;i<N;i++){
            a[i]=scanner.nextInt();
        }
        long sum=0;
        for(int i=0;i<N;i++){
            sum+=a[i]-(i+1);
        }
        if(sum%N==0){
            long b=sum/N;
            long result=0;
            for(int i=0;i<N;i++){
                result+=Math.abs(a[i]-(b+i+1));
            }
            System.out.println(result);
            return;
        }else{
            long b1=(long)Math.floor(sum/(double)N);
            long b2=(long)Math.ceil(sum/(double)N);
            long result1=0;
            long result2=0;
            for(int i=0;i<N;i++){
                result1+=Math.abs(a[i]-(b1+i+1));
                result2+=Math.abs(a[i]-(b2+i+1));
            }
            System.out.println(Math.min(result1,result2));

        }

    }
}
