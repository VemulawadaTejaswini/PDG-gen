import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        long A = sc.nextLong();
        long B = sc.nextLong();
        long N = sc.nextLong();
        long temp = 0;
        for(long i=0;i<=N;i++){
            long front=(A*i)/B;
            long back=i/B;
            if(temp<(front-A*back))
                temp=front-A*back;
        }
        System.out.println(temp);
    }
}