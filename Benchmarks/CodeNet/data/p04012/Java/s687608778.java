import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String w=sc.next();
        char[]a=w.toCharArray();
        int x=w.length();
        int sum=0;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(a[i]==a[j]){
                    sum++;
                }
            }
        }
        if(sum%2==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
}
        
        
    }
