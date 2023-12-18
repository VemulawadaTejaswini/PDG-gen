import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String[]s=new String[N];
        for(int i=0;i<N;i++){
            s[i]=sc.next();
        }
        int M=sc.nextInt();
        String[]t=new String[M];
        for(int i=0;i<M;i++){
            t[i]=sc.next();
        }
        int max=0;
        for(int i=0;i<N;i++){
            int a=0;
            for(int j=i;j<N;j++){
                if(s[i].equals(s[j])){
                    a++;
                }
            }
            for(int j=0;j<M;j++){
                if(s[i].equals(t[j])){
                    a--;
                }
            }
            if(a-1>=max){
                max=a;
            }
        }
        System.out.println(max);
       
        
    }}