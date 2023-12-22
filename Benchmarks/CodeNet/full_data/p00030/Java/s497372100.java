import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                while(n != 0){ 
                        int s = sc.nextInt();
                        System.out.println(combination(s, 0, n));
                        n = sc.nextInt();
                }   
                sc.close();
        }   
        static int combination(int s, int floor, int n){
                if(n == 1){ 
                        return floor <= s ? 1: 0;
                }else{
                        int sum = 0;
                        for(int i = floor; i <= s; i++){
                                sum += combination(s-i, i+1, n-1);
                        }   
                        return sum;
                }   
        }   
}