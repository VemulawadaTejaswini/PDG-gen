import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String[] A = new String[N];
        String[] B = new String[M];
        String ans = " ";

        for(int i=0; i<N; i++){
            A[i] = sc.next(); 
        }
        for(int y=0; y<M; y++){
            B[y] = sc.next();
        }

        if(N == 1){
            if(A[0].contains(B[0])){
                System.out.println("Yes");
            }
        }

        if(M == 1){
            for(int g=0; g<N; g++){
                if(A[g].contains(B[0])){
                    System.out.println("Yes");
                    break;
                }
            }
        }

        if(N > 1 && M > 1){
            for(int x=0; x<N; x++){
                for(int a=0; a<M; a++){
                    if(A[x].contains(B[a]) && A[x+1].contains(B[a+1])){
                        ans = "Yes";
                        System.out.println(ans);
                        break;
                    }
                }
                if(ans.equals("Yes")){
                    break;
                }else{
                    System.out.println("No");
                }
            }
        }
    }
}