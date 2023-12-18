import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b[]=new int[n];
        int []a=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
            if(b[i]==1){
            for(int j=1;j*j<=i+1;j++){
                if(n%j==0){
                    a[j-1]++;
                    if(j-1!=((i+1)/j-1))
                    a[(i+1)/j-1]++;
                }
            }}
        }
        int count=0;
        boolean c=true;
        for(int i=0;i<n;i++){
            if(a[i]%2!=b[i]){
                c=false;
                break;
            }
            else{
                if(b[i]==1)
                    count++;
            }
        }
        if(!c)System.out.println(-1);
        else {
        System.out.println(count);
        c=false;
        for(int i=0;i<n;i++){
            if(b[i]==1){
                if(!c){
                    System.out.println(i+1);
                    c=true;
                }
                else System.out.print(" "+(i+1));
                
            }
        }
        }
        
    }
}
