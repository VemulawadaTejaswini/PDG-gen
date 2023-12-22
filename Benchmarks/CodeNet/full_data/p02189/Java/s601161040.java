import java.util.*;
public class Main {
    static double[][] nums;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min=Integer.MAX_VALUE;
        int ans=0;
        int tmp;
        for(int i=0;i<n;i++){
            tmp=sc.nextInt();
            if(min>tmp){
                min=tmp;
                ans=i;
            }
        }
        System.out.println(ans+1);
    }


    
}
