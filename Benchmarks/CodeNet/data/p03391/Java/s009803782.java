import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        long ans =0;
        long sub=0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<N;++i){
            A[i] = scan.nextInt();
            B[i] = scan.nextInt();
            if(B[i]>=A[i]){
                ans+=B[i];
                sub+=B[i]-A[i];
            }else{
                list.add(B[i]);
            }
        }
        if(sub==0){
            System.out.println(0);
            return;
        }
        Collections.sort(list);
        for(int i=1;i<list.size();++i)ans+=list.get(i);
        System.out.println(ans);
    }
}