import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int ints[]=new int[N];
        for(int i=0;i<N;i++){
            ints[i]=scanner.nextInt();
        }
        Arrays.sort(ints);
        int max=ints[N-1];
        int temp=0;
        for(int i=0;i<N-1;i++){
            temp=ints[i];
            if(temp>max/2.0){
                if(max/2.0-ints[i-1]>=max/2.0-ints[i]){
                    System.out.println(max+" "+ints[i]);
                }else{
                    System.out.println(max+" "+ints[i-1]);
                }
                return;
            }
        }
        System.out.println(max+" "+temp);
    }
}
