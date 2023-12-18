import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scanner=new Scanner(System.in);
        int K=scanner.nextInt();
        int keta=0;
        int kazu=1;
        for(int i=0;i<K;i++){
            if(kazu==10){
                kazu=1;
                keta++;
            }
            System.out.println((int)Math.pow(10,keta)*(kazu+1)-1);
            kazu++;
        }
    }
    public static long func(long x){
        if(x/10==0){
            return x%10;
        }
        return x%10+func(x/10);
    }
    
}
