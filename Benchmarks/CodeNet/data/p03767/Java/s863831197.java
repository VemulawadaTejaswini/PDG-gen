import java.util.*;

public class Main {


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long result = 0;
        int N=sc.nextInt();

        Long[] a=new Long[3*N];

        for(int i=0;i<3*N;i++){
            a[i]=sc.nextLong();

        }

        Arrays.sort(a,Collections.reverseOrder());

        int j=0;

        while(j<N){
            result+=a[1+j*2];
            j++;
        }

        System.out.println(result);


    }
}
