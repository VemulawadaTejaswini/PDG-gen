import java.util.Scanner;
 
public class Main {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        long limit = n;
        int count=0;
        for(long i =2;i<=Math.sqrt(limit); i++){
            if(n%i==0){
                n/=i;
                count++;
//                System.out.println(n + " " + count + " " + i);
            }
        }
        boolean flag = false;
        while(flag){
            long a = n;
            for(long i =2;i<=Math.sqrt(limit); i++){
                if(n%i==0){
                n/=i;

                }
            }
            if(a==n){
                flag = true;
            }
        }
        if(n!=1){
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}