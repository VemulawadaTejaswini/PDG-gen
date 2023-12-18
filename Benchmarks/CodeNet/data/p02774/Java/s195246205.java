//Pairs.java
import java.util.Scanner;
class  Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=(n*(n-1))/2;
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        
        int ans[]=new int[sum];
        for(int s=0; s<n; s++){
            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    ans[s]=a[i]*a[j];
                    System.out.print(ans[s]);
                }
            }
        }
        int tmp;
        for(int i = 0; i < n - 1; i++) {
            for(int j = n - 1; i < j; j--) {
                if(a[j-1] > a[j]) {
                    tmp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.println(ans[k]);
        sc.close();
    }
}