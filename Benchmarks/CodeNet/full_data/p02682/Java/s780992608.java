import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int max=0;

        for(int i=1; i<=A; i++){
            max++;
        }
        K-=A;
        if(K > 0){
            K-=B;
        }
        if(K > 0){
            while(K > 0 && C>0){
                K--;
                C--;
                max--;
            }
        }

        System.out.println(max);

        sc.close();
    }
    
}