import java.util.*;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        loop:for(int i=2; i<=55555; i++){
            for(int j=2; j<=Math.sqrt(i)+1; j++){
                if(i%j==0){
                    continue loop;
                }
            }
            if(i%5==1){
                list.add(i);
            }
            if(list.size()==N){
                break loop;
            }
        }

        for(int i=0; i<N-1; i++){
            System.out.println(list.get(i) + " ");
        }
        System.out.println(list.get(N - 1));
    }
}