
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int M=scanner.nextInt();
        long[] Acc=new long[N+1];
        for(int i=1;i<Acc.length;i++){
            Acc[i]=Acc[i-1]+scanner.nextInt();
        }
        //System.out.println(Arrays.stream(Acc).boxed().collect(Collectors.toList()));
        long result=0;
        for(int start=0;start<N;start++){
            for(int end=start+1;end<N+1;end++){
                //System.out.println(String.format("start,end,diff=%d,%d,%d",start,end,Acc[end]-Acc[start]));
                if((Acc[end]-Acc[start])%M==0)result++;
            }
        }
        System.out.println(result);
    }


}
