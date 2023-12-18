import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        
        ArrayList<Integer> num = new ArrayList<Integer>();
        for(int i=A; i<=B; i++){
            num.add(i);
        }
        
        if(B < K){
            for(int i=A; i<=B; i++){
                System.out.println(i);
            }
            return;
        }
        
        for(int i=0; i<K; i++){
            System.out.println(num.get(i));
        }
        
        for(int i=K; i>=1; i--){
            System.out.println(num.get(num.size()-i));
        }
    }
}