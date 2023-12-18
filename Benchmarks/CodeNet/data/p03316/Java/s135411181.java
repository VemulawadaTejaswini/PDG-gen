import java.util.*;
 
public class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int s=N;
        long q=0;
        while(N>0){
            int rem=N%10;
            q+=rem;
            N/=10;
        } 
        //System.out.println("q="+q);
        if(s%q==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }    
    }
}