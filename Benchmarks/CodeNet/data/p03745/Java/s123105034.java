import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        sc.close();

        if(N>2){
            int i = 1;
            int count = 1;
            while(i < N-1){
                if((A[i]-A[i-1])>0 &&(A[i+1]-A[i]) < 0 ||
                    (A[i]-A[i-1])<0 &&(A[i+1]-A[i]) > 0 ){
                    count++;
                    i++;
                }
                i++;
            }
            System.out.println(count);
        } else {
            System.out.println(1);
        }
    }
}