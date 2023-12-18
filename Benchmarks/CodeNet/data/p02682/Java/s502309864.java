import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();

        int count = K;
        int sum =0;

        while(count>0){
            if(A>0){
                sum+=1;
                A--;
            }else if(B>0){
                B--;
            }else if(C>0){
                sum-=1;
                C--;
            }

            count--;
        }

        System.out.println(sum);
    }
}