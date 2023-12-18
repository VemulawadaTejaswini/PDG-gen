import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int sum=0;
        for(int a=1;a<=N;a++){
            for(int b=1;b<=N;b++){
                if(a%b>=K){
                    sum++;
                }
            }
        }
        System.out.println(sum);
        
    }}