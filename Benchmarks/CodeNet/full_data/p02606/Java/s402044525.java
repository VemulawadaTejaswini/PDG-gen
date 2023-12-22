import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int L=sc.nextInt();
        int R=sc.nextInt();
            int d=sc.nextInt();
        if(L%d==0){
            System.out.println(R/d-L/d+1);
        }else{
            System.out.println(R/d-L/d);
        }
    }
}