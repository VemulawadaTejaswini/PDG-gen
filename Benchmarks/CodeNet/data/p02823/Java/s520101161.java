import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int N = sn.nextInt();
        int A = sn.nextInt();
        int B = sn.nextInt();
        int cnt = 0;

        if(A % 2 == B % 2){
            while(!(A == B)){
                A++;
                B--;
                cnt++;
            }
        }else{
            while(!(A == B)){
                if(A-1 > N-B){
                    cnt++;
                    A++;
                    if(B == N){
                        continue;
                    }else{
                        B++;
                    }
                }else{
                    cnt++;
                    B--;
                    if(A == 1){
                        continue;
                    }else{
                        A--;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}