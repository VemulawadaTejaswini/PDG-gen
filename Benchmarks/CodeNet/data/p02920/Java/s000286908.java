import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[(int)Math.pow(2,n)];
        for(int i=0;i<(int)Math.pow(2,n);i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int m=(int)Math.pow(2,n);
        int l=0,ll=0;
        int g=0;
        int max=-1;
        boolean ans=true;
        for(int i=0;i<n;i++){
            ll=l;
            for(int j=ll;j<ll+Math.pow(2,n-i-1);j++){
                if(max==a[j]){
                    g++;
                }
                else{
                    max=a[j];
                    g=1;
                }
                l++;
            }
            if(a[m-g]==max){
                ans=false;
            }
        }
        System.out.println(ans?"Yes":"No");
    }
}
