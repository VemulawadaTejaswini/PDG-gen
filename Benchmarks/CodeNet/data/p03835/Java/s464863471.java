import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), s = sc.nextInt(), count = 0;
        
        for(int i=0;i<=k;i++){
            for(int j=0;j<=k;j++){
                for(int m=0;m<=k;m++){
                    if(s==i+j+m){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
