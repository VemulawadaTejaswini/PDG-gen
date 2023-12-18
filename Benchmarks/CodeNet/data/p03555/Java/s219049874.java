import java.util.*;
class Dpro{
    static int digitSum(int n){
        int sum=0;
        while(n>=1){
            sum+=(n%10);
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner std=new Scanner(System.in);
        int k=std.nextInt();
        int i=1;
        int K=k;
        int min=digitSum(K);
        while(i<k*k){
            K=k*i;
            if(digitSum(K)<min) min=digitSum(K);
            i++;
        }
        System.out.println(min);
    }
}