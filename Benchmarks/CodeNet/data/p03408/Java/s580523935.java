import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        int m=sc.nextInt();
        String t[]=new String[m];
        for(int i=0;i<m;i++){
            t[i]=sc.next();
        }
        int ans[]=new int[n];
        
        for(int i=0;i<n;i++){
            ans[i]=0;
            for(int j=0;j<n;j++){
                if(s[i].equals(s[j])){
                    ans[i]++;
                }
            }
            for(int j=0;j<m;j++){
                if(s[i].equals(t[j])){
                    ans[i]--;
                }
            }
        }
        int max=ans[0];
        for(int i=0;i<n;i++){
            max=Math.max(ans[i],max);
        }
        if(max<=0) System.out.println(0);
        else System.out.println(max);
    }
}