import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b=new int[n];
        int sum=0;
        for(int i=0;i<n;++i){
          b[i]= sc.nextInt();
        }
        for(int i=0;i<n-1;++i){
          if(b[i]>0){
            sum+=b[i];
          }else{
            b[i]*=-1;
            b[i+1]*=-1;
            sum+=b[i];
          }
        }
        System.out.println(sum+b[n-1]);
    }
}
