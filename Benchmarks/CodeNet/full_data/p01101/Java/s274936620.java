import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        while(true){
            int n=s.nextInt();
            int m=s.nextInt();
            if(n==0&&m==0) break;
            int v[]=new int[n];
            for(int i=0;i<n;i++){
                v[i]=s.nextInt();
            }
            int max=0;
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(max<v[i]+v[j]&&v[i]+v[j]<=m) max=v[i]+v[j];
                }
            }
            if(max==0) System.out.println("NONE");
            else System.out.println(max);
        }
    }
}
