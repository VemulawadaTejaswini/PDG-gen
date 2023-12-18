import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int b=-1,t=-1;
        boolean f=false;
        
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        a=Bubble_sort(a,n);
        
        for(int i=1;i<n;i++){
            if(a[i]==a[i-1]&&t!=-1&&t!=-1){
                b=t;
                t=a[i];
                i++;
                f=true;
            }
            else if(a[i]==a[i-1]&&t!=-1){
                b=a[i];
                i++;
            }
            else if(a[i]==a[i-1]){
                t=a[i];
                i++;
            }
        }
        if(f==true){
            System.out.println(t*b);
        }
        else{
            System.out.println("0");
        }
    }
    static int[] Bubble_sort(int a[],int n){	//バブルソート
        int i,j;
        
        for(i=0;i<n-1;i++){
            for(j=n-1;j>i;j--){
                if(a[j]<a[j-1]){
                    int tmp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=tmp;
                }
            }
        }
        return a;
    }
}