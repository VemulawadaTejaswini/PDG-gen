import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int sum = 0;
        int count = 0;
        
        for(int i=1;i<=N;i++){
            if(i%2==1){
                count = 0;
                for(int j=1;j<=i;j++){
                    if(i%j==0){
                        count++;
                    }
                }
                
                if(count==8){
                    sum++;
                }
            }
        }
        
        System.out.println(sum);
        
    }
}
