
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int i = 0;
        int ans = -1;
        while(i<1000000001 ){
            if(Math.abs(a-i) == Math.abs(b-i)){

                ans = i;
                break;
            }
            i++;
        }

        if(ans == -1){
            System.out.println("IMPOSSIBLE");
        }else{
            System.out.println(ans);
        }



    }
}
