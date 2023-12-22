import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.math.*;
class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A[] = new int[N];
        int ans = 1;
        try{
            for(int i=0;i<N;i++){
                A[i] = scanner.nextInt();
                if(A[i] == 0){
                    ans = 0;
                    break;
                }
                ans *= A[i];
            }
        }
        catch(Exception e){
            ans = -1;
        }
        finally{
            System.out.println(ans);
        }


    }

}