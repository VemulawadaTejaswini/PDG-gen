
import java.util.*;



public class Main {
    public static int[] ints;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        final int N=scanner.nextInt();
        ints=new int[N];
        for(int i=0;i<N;i++){
            ints[i]=scanner.nextInt();
        }
        System.out.println(N-Math.max(orderNum(),revOrderNum()));
    }
    public static int orderNum(){
        int result=0;
        int count=1;
        for(int i=0;i<ints.length;i++){
            if(ints[i]==count){
                result++;
                count++;
            }
        }
        return result;
    }
    public static int revOrderNum(){
        int result=0;
        int count=ints.length;
        for(int i=ints.length-1;i>=0;i--){
            if(ints[i]==count){
                result++;
                count--;
            }
        }
        return result;
    }
}