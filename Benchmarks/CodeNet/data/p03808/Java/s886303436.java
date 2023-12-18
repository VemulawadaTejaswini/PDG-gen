

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int min=0;
        int N=in.nextInt();
        int [] arr=new int[N];
        int i=0;
        while(i<N){
            arr[i]=in.nextInt();
            if(i>0)
                min=arr[i]<arr[min]?i:min;
            i++;
        }
        int j=1,k=min;
        boolean flag=false;
        while(true){
//            System.out.println(j+""+(arr[(N+k)%N]>j));
            if(arr[(N+k)%N]>=j){
                arr[(N+k)%N]-=j;
                j=(j+1)%(N+1);
                k=(k+1)%N;
            }
            else {
//                flag=true;
                break;
            }
//            System.out.println(k+" "+Arrays.toString(arr));
        }
        int l=0;
        for ( l = 0; l < N ; l++) {
            if(arr[l]!=0){
//                System.out.println("NO");
                flag=true;
            }

        }
        if(flag)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}
