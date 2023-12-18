import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        boolean f=true;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b[]=a.clone();
        boolean f2=true;
        for(int i=1;i<n;i++){
            if(a[i]>a[i-1]){
                a[i]--;
            }
            if(a[i]<a[i-1]){
                f=false; break;
            }
        }
        b[0]--;
        for(int i=1;i<n;i++){
            if(b[i]>b[i-1]){
                b[i]--;
            }
            if(b[i]<b[i-1]){
                f2=false; break;
            }
        }
        System.out.println((f||f2)?"Yes":"No");
    }
}
