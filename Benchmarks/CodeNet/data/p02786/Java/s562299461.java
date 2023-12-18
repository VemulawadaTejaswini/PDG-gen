import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;
  
public class Main{
    public static void main(final String[] args){
       
        final Scanner sc = new Scanner(System.in);
        Long N = sc.nextLong();
        Long ans =0l;
        Long counter=0l;
        for(;N>1;){
                counter++;
                N =N/2l;
        }
        if(counter==0){
            System.out.println(1);
            return;
        }
        for(;counter>0;counter--){
            ans += (long)Math.pow(2l, counter);
        }
        System.out.println(ans+1);
        /* int K = sc.nextInt();
        Long ans = 0l;
        
        HashSet hoge =new HashSet<Integer>(); 
        ArrayList Zero =new ArrayList<Integer>(); 
        for(int i =0;i<N;i++){
                //hoge.add(sc.nextInt());
                Zero.add(sc.nextLong());
        }
        Collections.sort(Zero);
        int count =0;
        for(int i=N-1;0<K&& i>-1;i--){
            Zero.set(i, 0l);
            K--;
        }
        for(int i =0;i<N;i++){
            ans =ans+(Long)Zero.get(i);
        } */
        
        

/*         String abc = "abcdefghijklmnopqrstuvwxyz";
        Long alf = 26l;
        Long N = sc.nextLong();
        String ans = "";

        for(;N>0;){
            Long Num = N-1;
            int tStr = (int)(Num%alf);
            ans = abc.substring(tStr,tStr+1)+ans;
            N =  Num/alf;
        } */
    }
}
    


    