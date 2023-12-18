import java.util.*;
public class Goodsequence {
    public static void main(String[] args){
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] a = new int[N];
        int[] flag = new int[N];
        for(int i=0;i<N;i++){
            a[i] = sc.nextInt();
            flag[i] = 0;
        }
        Arrays.sort(a);
        int sum = 0;
        int count = 0;
        for(int i=0;i<N;i=i+count){
            count=0;
            for(int j=i;j<N;j++){
                if(a[j]==a[i]) count++;
                else break;
            }
            if(count<a[i]) sum = sum + count;
            else sum = sum - a[i] + count;


        }


        System.out.println(sum);

    }

}
