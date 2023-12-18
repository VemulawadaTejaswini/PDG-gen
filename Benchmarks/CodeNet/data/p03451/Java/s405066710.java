import java.util.Scanner;
import java.util.stream.IntStream;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] a1 = IntStream.range(0,N).map(i->scan.nextInt()).toArray();
        int[] a2 = IntStream.range(0,N).map(i->scan.nextInt()).toArray();
        int ans = 0;
        for(   int i=0;i<N;++i){
            int res=0;
            for(int j=0;j<=i;j++){
                res+=a1[j];
            }
            for(int j=i;j<N;++j){
                res+=a2[j];
            }
            ans = Math.max(res,ans);
        }
        System.out.println(ans);

    }
}