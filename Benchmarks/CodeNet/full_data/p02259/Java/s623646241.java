import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a=new int[101];
        int i,t,j,n,co=0;
        n = sc.nextInt();
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(i=n-1;i>0;i--){
            for(j=n-1;j>=n-i;j--){
                if(a[j]<a[j-1]){
                    t=a[j];
                    a[j]=a[j-1];
                    a[j-1]=t;
                    co++;
                }

            }
        }

        System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4]);
        System.out.println(co);
    }
}
