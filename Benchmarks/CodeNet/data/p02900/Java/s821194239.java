import java.util.*;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
 
        long A = sc.nextLong();
        long B = sc.nextLong();
        
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for(int i=2; i<=1000000; i++){
            if(A%i==0){
                lista.add(i);
                A = A / i;
                i--;
            }
        }
        ArrayList<Integer> listb = new ArrayList<Integer>();
        for(int i=2; i<=1000000; i++){
            if(B%i==0){
                listb.add(i);
                B = B / i;
                i--;
            }
        }
        int ans = 0;
        for(int i=0; i<listb.size(); i++){
            if(lista.contains(listb.get(i))){
                if(i>0 && listb.get(i)!=listb.get(i-1)){
                    ans += 1;
                }
                if(i==0){
                    ans += 1;
                }
                lista.remove(lista.indexOf(listb.get(i)));
            }
        }
        System.out.println(ans + 1);
    }
}