import java.util.*;
                     
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] R = new int[t];
        int i, j, a, bnf;
        R[0] = sc.nextInt();
        R[1] = sc.nextInt();
        int max = R[1];
        int min = R[0];
        bnf = max - min;
                     
        for(i=2; i<t; i++){
            R[i] = sc.nextInt();
            if(bnf<0 && R[i]<R[i-1]){
                a = R[i] - R[i-1];
                if(bnf < a){ bnf = a; max = R[i]; min = R[i-1];}
            }else{
                if(min>R[i]){ 
                    a = max - min;
                    if(bnf<a) bnf = a;
                    min = R[i];
                    max = R[i];
                }else if(max<R[i]) max = R[i];
            }
        }
        a = max - min;
        if(bnf<a) bnf = a;
                      
        System.out.println(bnf);
    }
}