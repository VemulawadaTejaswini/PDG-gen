import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String ,Integer> M = new HashMap<>();
        
        int N = sc.nextInt();
        
        for(int i=0;i<N;i++){
            int q = sc.nextInt();
            
            if(q == 0){
                M.put(sc.next(),sc.nextInt());
            }else{
                System.out.println(M.get(sc.next()));
            }
        }
    }
}
