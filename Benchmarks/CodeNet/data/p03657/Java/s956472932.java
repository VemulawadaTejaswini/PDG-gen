import java.util.*;

/**
 * Created by DELL on 2017/7/15.
 */
public class main {




    public static void main(String[] args) {
        Scanner  in=new Scanner(System.in);
        int A=in.nextInt();
        int B=in.nextInt();
        if(A%3==0||B%3==0||(A+B)%3==0){
            System.out.println("Possible");
        }
        else System.out.println("Impossible");
}
}