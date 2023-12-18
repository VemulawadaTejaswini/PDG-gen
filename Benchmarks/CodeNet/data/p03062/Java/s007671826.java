import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b=new int[n];
        int sum=0;
        for(int i=0;i<n;++i){
          b[i]= sc.nextInt();
          sum+=b[i]<0?-b[i]:b[i];
        }
        
        System.out.println(sum);
    }
}
