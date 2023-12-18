
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        long[] ints=new long[N];
        for(int i=0;i<N;i++){
            ints[i]= scanner.nextLong();
        }
        long[] longs=new long[N+1];
        longs[0]=0;
        for(int i=1;i<N+1;i++){
            longs[i]=longs[i-1]+ints[i-1];
        }
        Arrays.sort(longs);
        long result=0;
        long count=0;
        for(int i=1;i<N+1;i++){
            if(longs[i-1]==longs[i]){
                count++;
            }else{
                if(count>0){
                    result+=count*(count+1)/2;
                    count=0;
                }
            }
        }
        if(count>0){
            result+=count*(count+1)/2;
        }
        System.out.println(result);
    }
}
