import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        long res = 0;
        
        for(int a = 1; a <= N; ++a){
            for(int b = 1; b <= N; ++b){
                for(int c = 1; c <= N; ++c){
                    res += (a + b + c) / 3;
                }
 
            }
        }
        System.out.println(res);
    }
}