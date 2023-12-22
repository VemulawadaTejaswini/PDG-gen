import java.util.*;
                   
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] R = new int[t];
        int i, min, bnf;
        for(i=0; i<t; i++) R[i] = sc.nextInt();
        min = R[0];
        bnf = Integer.MIN_VALUE;
        for(i=1; i<t; i++){
            bnf = Math.max(bnf, R[i]-min);
            min = Math.min(min, R[i]);
        }
                    
        System.out.println(bnf);
    }
}