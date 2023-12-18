import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int Q = sc.nextInt();
        int[] T = new int[Q];
        int[] F = new int[Q];
        String[] C = new String[Q];
        int x = 0;

        for(int i=0; i<Q; i++){
            T[i] = sc.nextInt();
            if(T[i]==2){
                F[i] = sc.nextInt();
                C[i] = sc.next();
            }
        }

        for(int i=0; i<Q; i++){
            String Sn = "";
            if(T[i]==1){
                if(i!=Q-1){
                    if(T[i+1]==1){
                        x += 1;
                    }
                    else if(T[i+1]!=1 && (x%2!=0 || x==0)){
                        int l = S.length();
                        for(int j=l-1; j>=0; j--){
                                Sn += S.substring(j, j + 1);
                        }
                        S = Sn;
                        x = 0;
                    }
                }
                else{
                    x += 1;
                    int l = S.length();
                    if(x%2!=0){
                        for(int j=l-1; j>=0; j--){
                                Sn += S.substring(j, j + 1);
                        }
                    }
                    S = Sn;      
                }
            }
            else if(T[i]==2){
                if(F[i]==1){
                    Sn = C[i] + S;
                    S = Sn;
                }
                else if(F[i]==2){
                    Sn = S + C[i];
                    S = Sn;
                }
            }
        }
        System.out.println(S);
    }
}