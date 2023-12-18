import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N=sc.nextInt(),count=0,temp=0;
        long res=(long) Math.pow(3,N);
        for(int i=0;i<N;i++){
            temp=sc.nextInt();
            if(temp%2==0){
                count++;
            }
        }
        res-=(long)Math.pow(2,count);
        System.out.println(res);
    }
}
