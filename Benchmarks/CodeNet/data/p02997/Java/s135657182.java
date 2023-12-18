import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        if(k>(n-1)*(n-2)/2)System.out.println(-1);
        else{
            System.out.println(n);
            for(int i=1;i<n;i++)
                System.out.println(1+" "+(i+1));
            int j=0;
            for(int i=0;i<(n-1)*(n-2)/2-k;i++){
                if((i+j)%(n-1)==(i+j)/(n-1))j++;
                System.out.println(2+(i+j)/(n-1)+" "+((i+j)%(n-1)+2));
            }
        }
    }
}
