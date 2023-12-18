import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n =s.nextInt();
        long sum=0;

        for(int i=1;i<=n;i++){
            if(i%3!=0 && i%5!=0){
                sum=sum+i;
            }
        }

        System.out.println(sum);

    }
}




