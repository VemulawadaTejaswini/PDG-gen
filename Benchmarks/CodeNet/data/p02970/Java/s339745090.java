import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        int ans = n/(2*d+1);

        if (n%(2*d+1)==0){
            System.out.println(ans);
        }else{
            System.out.println(ans+1);
        }



    }
}
