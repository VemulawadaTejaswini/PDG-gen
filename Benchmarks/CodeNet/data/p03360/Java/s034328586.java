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
        int kk=1;
        for(int i=0;i<K;i++){
            kk=kk*2;
        }
        a[2]=a[2]*kk;
        System.out.println(a[0]+a[1]+a[2]);


        
}
        
        
    }
