import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        for(int i=1; i<6; i++){
            int x = sn.nextInt();
            if(x == 0){
                System.out.println(i);
                break;
            }
        }
    }
}