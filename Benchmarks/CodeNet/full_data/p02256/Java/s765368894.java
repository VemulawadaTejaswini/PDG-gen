import java.util.*;

public class B{
    public static void main(String[] args){
        int n = 1;
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        int y = a.nextInt();
        if(x > y){
            for(int i=1; i <= y/2; i++){
                if(x%i == 0 && y%i == 0){
                    n = i;
                }
            }
        }
        else{
            for(int i = 1; i <= x/2; i++){
                if(x%i == 0 && y%i == 0){
                    n = i;                
               }
            }       
        }
        System.out.println(n);
    }
}
