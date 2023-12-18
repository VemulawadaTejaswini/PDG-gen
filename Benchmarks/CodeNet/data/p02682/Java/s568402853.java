import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        int count =0;
        if(A+B>=K){
            for(int i=0;i<A;i++){
                count+=1;
            }
        }else{
            for(int i=0;i<A;i++){
                count+=1;
            }for(int i=0;i<(K-(A+B));i++){
                count-=1;
            }
        }
        System.out.println(count);
    }
}