
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        final int X=scanner.nextInt();
        boolean[] booleans=new boolean[1000];
        booleans[0]=true;
        for(int i=2;i<32;i++){
            for(int j=2;Math.pow(i,j)<=1000;j++){
                booleans[(int)Math.pow(i,j)-1]=true;
            }
        }
        for(int i=X-1;i>-1;i--){
            if(booleans[i]) {
                System.out.println(i+1);
                return;
            }
        }



    }

}