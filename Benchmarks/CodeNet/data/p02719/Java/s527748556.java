import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if(n==0){
            System.out.println(0);
            return;
        }

        if(n > k){
            n = n - (n/k -1)*k;
        }
        else if(n<k){
            n = n - (k/n - 1)*n;
        }

        long diff = 1000000000000000001L;
        while(true){
            long tmp = Math.abs(n-k);
            if(tmp < diff){
                diff = tmp;
                n = tmp;
            }
            else{
                break;
            }
        }

        System.out.println(diff);
    }
}
