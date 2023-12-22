import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                while(sc.hasNext()){
                        int n = sc.nextInt();
                        System.out.println(primeNumber(n));
                }   
                sc.close();
        }   
        static int primeNumber(int n){
                boolean[] notprime = new boolean[n+1];
                int counter = 0;
                for(int i = 2; i <= n; i++){
                        if(!notprime[i]){
                                counter++;
                                for(int j = 2; j*i <= n; j++){
                                        notprime[j*i] = true;
                                }   
                        }   
                }   
                return counter;
        }   
}