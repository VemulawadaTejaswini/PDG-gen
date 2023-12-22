import java.util.*;
 
class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=input.nextInt();
        }
        boolean flag=true;
        int ans=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i!=j&&a[i]%a[j]==0){
                    flag=false;
                }
            }
            if(flag){
                ans++;
            }
          flag=true;
        }
        System.out.print(ans);
    }
}