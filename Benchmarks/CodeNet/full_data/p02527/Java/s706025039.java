import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=s.nextInt();
        Arrays.sort(a);
        for(int i=0;i<n-1;i++)
            System.out.print(a[i]+" ");
        System.out.println(a[n-1]);
    }
}
//by TTTMongolia 11/05/2012