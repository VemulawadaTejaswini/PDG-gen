import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int[] H = new int[N];

        for(int i=0; i<N; i++){
            H[i] = sc.nextInt();
        }
        if(N==1){
            System.out.println("Yes");
            return;
        }
        for(int i=0; i<N-1; i++){
            int d = H[i] - H[i + 1];
            if(d == 1){
                if(i==0){
                    H[i] -= 1;
                }
                else{
                    if(H[i]-1>H[i-1]){
                        H[i] -= 1;
                    }
                    else if(H[i]-1<H[i-1]){
                        System.out.println("No");
                        break;
                    }
                }
            }
            else if(d>1){
                System.out.println("No");
                break;
            }
            if(i==N-2){
                System.out.println("Yes");
            }
        }
    }
}