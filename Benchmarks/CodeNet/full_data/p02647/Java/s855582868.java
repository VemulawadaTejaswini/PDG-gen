
import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;
  
public class Main{
    public static void main(final String[] args){
 
        final Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int K =sc.nextInt();
        Map<Integer,Integer> numMap = new HashMap<>();
        Map<Integer,Integer> newMap = new HashMap<>();
        Map<Integer,Integer> hogeMap = new HashMap<>();
        for(int i =1;i<=N;i++){
            numMap.put(i, sc.nextInt());
            newMap.put(i,0);
            hogeMap.put(i,0);
        }
        for(int i= 0;i<K;i++){
            //newMap =  numMap;
            for(int i2= 1; i2<=N;i2++){

                for(int i4 =0 ;i4 <=numMap.get(i2)&&i4+i2<=N;i4++){
                    newMap.replace(i2+i4, newMap.get(i2+i4)+1);
                }
                for(int i4 =1 ;i4<i2&&i4<=numMap.get(i2);i4++){
                    newMap.replace(i2-i4, newMap.get(i2-i4)+1);
                }
            }
            numMap = newMap;
            newMap=hogeMap;
        } 
        String hoge = numMap.values().toString();
        
        System.out.println(hoge.replace("[", "").replace("]", "").replace(",", ""));

        

        
        /* 
        long N = sc.nextLong();
        int ans=0;
        long q =2;
 
        //1だった時はさっさと終わらす
        if(N==1){
            System.out.println(0);
            return;
        }
 
        //本編
        while(q*q<=N){
            //qを決定する
            if(N%q ==0){
                //qの累積を全部発見する
                for(int i = 1; N>=Math.pow(q,i);i++){
                    if(N%Math.pow(q, i)==0){
                        //発見するたびにカウントアップ
                        ans++;
                        //発見するたびに除算
                        N = (long) (N / Math.pow(q, i));
                    }
                }
                //qの累積は見つけ尽くしたので、Nからqを完全に取り除く
                while(N%q ==0){
                    N = N/q;
                }
            }   
            q++;
        }

        //1以外の数が搾りカスとして出たら足してあげる
        if(N != 1){ans++;}
            System.out.println(ans);*/
    }
} 