import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int K = sc.nextInt();
        Queue<Long> q = new ArrayDeque<Long>();
 
        for(int i=1; i<=9; i++){
            q.add((long)i);
        }
        for(int i=1; i<=K; i++){
            long x = q.poll();

            if(x%10!=0) q.add(10 * x + x % 10 - 1);
            q.add(10 * x + x % 10);
            if(x%10!=9) q.add(10 * x + x % 10 + 1);
            
            if(i==K){
                System.out.println(x);
            }
        }
    }
}