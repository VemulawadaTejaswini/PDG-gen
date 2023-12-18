import java.util.*;
import java.util.Arrays;
public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k=0;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(n*m==i*j){
                    k=1;
                }
            }
        }
        if(k==1){
            System.out.println(m*n);
        }
        else{
            System.out.println(-1);
        }
        


    }
}