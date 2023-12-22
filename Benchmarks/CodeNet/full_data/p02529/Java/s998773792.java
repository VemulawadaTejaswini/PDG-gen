import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=s.nextInt();
        int m=s.nextInt();
        int b[]=new int[n];
        for(int i=0;i<m;i++)b[i]=s.nextInt();
        int count=0;
        for(int i=0;i<n;i++)for(int k=0;k<m;k++)if(b[k]==a[i]){count++;break;}

        System.out.println(count);
    }
}
//by TTTMongolia 11/05/2012