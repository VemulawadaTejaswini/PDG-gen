import java.util.*;
                 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] R = new int[t];
        int i, j, a, bnf;
        R[0] = sc.nextInt();
        R[1] = sc.nextInt();
        bnf = R[1] - R[0];
                 
        for(i=2; i<t; i++){
            R[i] = sc.nextInt();
                for(j=0; j<i; j++){
                    a = R[i] - R[j];
                if(bnf < a) bnf = a;
            }
        }
                  
        System.out.println(bnf);
    }
}