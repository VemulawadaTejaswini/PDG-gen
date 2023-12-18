import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]a=new int[N];
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
        }
        int plus=0;
        int[]iro=new int[8];
        for(int i=0;i<8;i++){
            iro[i]=0;
        }
        for(int i=0;i<N;i++){
            if((a[i]>=1)&&(a[i]<=399)){
                iro[0]++;
            }
            if((a[i]>=400)&&(a[i]<=799)){
                iro[1]++;
            }
            if((a[i]>=800)&&(a[i]<=1199)){
                iro[2]++;
            }
            if((a[i]>=1200)&&(a[i]<=1599)){
                iro[3]++;
            }
            if((a[i]>=1600)&&(a[i]<=1999)){
                iro[4]++;
            }
            if((a[i]>=2000)&&(a[i]<=2399)){
                iro[5]++;
            }
            if((a[i]>=2400)&&(a[i]<=2799)){
                iro[6]++;
            }
            if((a[i]>=2800)&&(a[i]<=3199)){
                iro[7]++;
            }
            if(a[i]>=3200){
                plus++;
            }
        }
        int sum=0;
        for(int i=0;i<8;i++){
            if(iro[i]>0){
                sum++;
            }
        }
        int max=sum+plus;
        System.out.println(sum);
        if(max>8){
            System.out.println(8);
        }else{
            System.out.println(max);
        }

        

        }
       
        
    }