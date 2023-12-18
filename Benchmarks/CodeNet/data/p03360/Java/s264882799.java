import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;


public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[]a=new int[3];
        for(int i=0;i<3;i++){
            a[i]=sc.nextInt();
        }
        int K=sc.nextInt();
        Arrays.sort(a);
        a[2]=a[2]*2*K;
        System.out.println(a[0]+a[1]+a[2]);


        
}
        
        
    }
