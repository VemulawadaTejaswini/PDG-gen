import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int ans=0;

        for(int i=X+1; i<(X*2); i++){
            for(int j=2; j<X; j++){
                if(i%j==0){
                    break;
                }
                if(j==X-1){
                    ans=i;
                    break;
                }
            }
            if(ans!=0){
                break;
            }
        }

        System.out.println(ans);
    }
}