import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int[] v=new int[n];
        HashMap<Integer,Integer> mapE=new HashMap<>();
        HashMap<Integer,Integer> mapO=new HashMap<>();
        for (int i = 0; i < n; i++) {
            v[i]=sc.nextInt();
            if(i%2==0){
                mapE.put(v[i],mapE.getOrDefault(v[i], 0)+1);
            }else{
                mapO.put(v[i], mapO.getOrDefault(v[i],0)+1);
            }
        }
        
        int Emax=0,Omax=0;
        for(int k:mapE.keySet()){
            Emax=max(Emax,mapE.get(k));
        }
        for(int k:mapO.keySet()){
            Omax=max(Omax,mapO.get(k));
        }
        int tmpE=0,tmpO=0;
        for(int k:mapE.keySet()){
            if(mapE.get(k)==Emax)tmpE=k;
        }
        for(int k:mapO.keySet()){
            if(mapO.get(k)==Omax)tmpO=k;
        }
        int Emax2=0,Omax2=0;
        for(int k:mapE.keySet()){
            if(k!=tmpO)Emax2=max(Emax2,mapE.get(k));
        }
        for(int k:mapO.keySet()){
            if(k!=tmpE)Omax2=max(Omax2,mapO.get(k));
        }
        out.println(min(n-Omax-Emax2,n-Omax2-Emax));
    }
}
