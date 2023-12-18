import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int i=1;
        for(int n=0;n<N;n++){
        if(i*2>=i+K){
            i=i+K;
        }else{
            i=i*2;
        }
        if(n==N-1){
            System.out.println(i);
        }
        }
        
     
    }
}