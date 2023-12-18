import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n/2];
        int[] b=new int[n/2];
        for(int i=0;i<n/2;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int A=a[0];
        int B=b[0];
        int la=0;
        int lb=0;
        int lla=0;
        int llb=0;
        int pla=0;
        int plb=0;
        int pa=0;
        int pb=0;
        for(int i=0;i<n/2;i++){
            if(a[i]!=pa){
                pla=1;
                pa=a[i];
            }else{
                pla++;
            }
            if(pla>=la){
                la=pla;
                if(A!=a[i]){
                    lla=la;
                }
                A=a[i];
            }
            if(b[i]!=pb){
                plb=1;
                pb=b[i];
            }else{
                plb++;
            }
            if(plb>=lb){
                lb=plb;
                if(B!=b[i]){
                    llb=lb;
                }
                B=b[i];
            }
        }
        int ans =0;
        if(A==B){
            ans=n-Math.max(lla+lb,llb+la);
        }else{
            ans=n-(la+lb);
        }
        System.out.println(ans);
    }
}