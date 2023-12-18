import java.util.Scanner;

public class Main{
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        int N = sc.nextInt();
        int[] machi = new int [N+1];
        int[] kougeki = new int [N];
        
        for (int index=0; index<N+1; index++){
            machi[index]=sc.nextInt();
        }
        for (int index=0; index<N; index++){
            kougeki[index]=sc.nextInt();
        }
        
        Long count = 0l;
        
        for (int index=0; index<N+1; index++){
            if (index==0&&machi[index]>kougeki[index]){
                machi[index]=machi[index]-kougeki[index];
                count+=kougeki[index];
                kougeki[index]=0;
            } else if (index==0&&machi[index]<=kougeki[index]){
                count+=machi[index];
                kougeki[index]=kougeki[index]-machi[index];
                machi[index]=0;
            } else if (machi[index]<=kougeki[index-1]){
                count+=machi[index];
                machi[index]=0;
                kougeki[index-1]=0;
            } else {
                count+=kougeki[index-1];
                machi[index]-=kougeki[index-1];
                kougeki[index-1]=0;
                if (index<N){
                    if (machi[index]>kougeki[index]){
                        machi[index]-=kougeki[index];
                        count+=kougeki[index];
                        kougeki[index]=0;
                    } else {
                        count+=machi[index];
                        kougeki[index]=kougeki[index]-machi[index];
                        machi[index]=0;
                    }
                }
            }
        }
        
        System.out.println(count);
    }
}
