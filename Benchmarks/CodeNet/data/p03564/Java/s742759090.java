import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        
        int num = 1;
        for(int i=0; i<N; i++){
            if(num*2 < num+K){
                num = num*2;
            }else{
                num = num+K;
            }
        }
        
        System.out.println(num);
    }
}