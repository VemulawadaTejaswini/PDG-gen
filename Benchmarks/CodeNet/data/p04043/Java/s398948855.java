import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[]a=new int[2];
        a[0]=0;
        a[1]=0;
        for(int i=0;i<3;i++){
            int x=sc.nextInt();
            if(x==5){
                a[0]++;
            }
            if(x==7){
                a[1]++;
            }
        }
        if((a[0]==2)&&(a[1]==1)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        
        
}
        
        
    }
