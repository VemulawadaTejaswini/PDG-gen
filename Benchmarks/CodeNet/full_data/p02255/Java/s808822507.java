import java.util.Scanner;
public class Main{
    public static void main(String[] av){
         Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            int v=a[i];
            int j=i-1;
            while(j>=0&&a[j]>v){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=v;
        }
    }
}
