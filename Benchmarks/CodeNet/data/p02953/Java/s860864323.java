import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] H = new int[N];

        for(int i=0; i<N; i++){
            H[i] = sc.nextInt();
        }
        if(N==1){
            System.out.println("Yes");
        }
        else if(N>1){
            if(H[0]-H[1]==1){
                H[0] -= 1;
            }
            
            for(int i=0; i<N-1; i++){
                if(i==0 && H[i]-H[i+1]>1){
                    System.out.println("No");
                    break;
                }
                else if(i==0){
                    continue;
                }

                if(H[i]-H[i+1]>1){
                    System.out.println("No");
                    break;
                }
                else if(H[i]-H[i+1]==1 && H[i]>H[i-1]){
                    H[i] -= 1;
                }
                else if(H[i]-H[i+1]==1 && H[i]==H[i-1]){
                    System.out.println("No");
                    break;
                }

                if(i==N-2){
                    System.out.println("Yes");
                }
            }
        }
    }
}