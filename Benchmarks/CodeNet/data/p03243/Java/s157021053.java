import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] abc = {111, 222, 333, 444, 555, 666, 777, 888, 999, 1111};
        for(int i=0; i<abc.length;i++){
            if(n <= abc[i]){
                System.out.println(abc[i]);
                return;
            }
        }
    }
}