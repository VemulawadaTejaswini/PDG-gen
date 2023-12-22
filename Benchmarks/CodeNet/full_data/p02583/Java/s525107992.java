import java.util.*;
public class Main{
    final static Scanner sc=new Scanner(System.in);
    public static int isValid(long a, 
                                long b, long c) 
    {  
        if (a + b <= c || a + c <= b || b + c <= a) 
            return 0; 
        else
            return 1; 
    } 
    public static void main(String args[]){
        int s=sc.nextInt();
        long arr[]=new long[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextLong();
        }
        int ans=0;
        for(int i=0;i<s;i++){
            for(int j=i+1;j<s;j++){
                for(int k=j+1;k<s;k++){
                    if(arr[i]!=arr[j] && arr[i]!=arr[k] && arr[j]!=arr[k] && isValid(arr[i],arr[j],arr[k])==1L ){
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
        
    }
}