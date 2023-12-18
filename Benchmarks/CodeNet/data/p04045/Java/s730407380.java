import java.util.Scanner;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int[] D=new int[K];
        boolean[] hos=new boolean[10];
        for(int i=0; i<K; i++){
            D[i]=sc.nextInt();
            hos[D[i]]=true;
        }
        int[] hosyugo=new int[10-K];
        int tmp=0;
        for(int i=0; i<10; i++){
            if(!hos[i]){
                hosyugo[tmp]=i;
                tmp++;
            }
        }
        int itr=1;
        while(true){
            int price=ned(itr,hosyugo);
            if(price >= N){
                System.out.println(price);
                System.exit(0);
            }
            itr++;
        }

    }
    public static int ned(int itr,int[] hosyugo){
        String ret="";
        while(itr>0){
            int val=itr%hosyugo.length;
            ret=hosyugo[val]+ret;
            itr/=hosyugo.length;
        }
        for(int i=ret.length()-1; i>=0; i--){
        }
        return Integer.parseInt(ret);
    }

}
