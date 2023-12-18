import java.util.*;
public class main{

     public static void Main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] v=new int[n];
        int t=0;
        for(int i=0;i<n;i++){
            v[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++){
            if(i%2==0){
                if(v[i]!=v[i*2]){
                    System.out.println(v[i]);
                    t=1;
                    break;
                }
            }else{
                if(v[i]!=v[i*2+1]){
                    System.out.println(v[i]);
                    t=1;
                    break;
                }
            }
            for(int j=0;j<n;j++){
                if(v[i]==v[j]){
                    t=1;
                    System.out.println(n/2);
                    break;
                }
                
            }
        }
        if(t==0){
            System.out.println(0);
        }
        
     }
}