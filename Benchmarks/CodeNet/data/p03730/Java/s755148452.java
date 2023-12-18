import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        long sum=0;
        for(int i=0;i<10000;i++){
            sum=i*A;
            if(sum%B==C){
                System.out.println("YES");
                break;
            }
            if((i==9999)&&(sum%B!=C)){
                System.out.println("NO");
            }
        }
        
    }
        
     
    }
