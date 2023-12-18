//ColorfulSlimes2.java
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int slimes[]=new int[n];
		for(int i=0; i<n; i++){
            slimes[i]=sc.nextInt();
        }
        int ans=0;

        for(int i=0; i<n-1; i++){
            if(slimes[i]==slimes[i+1]){
                slimes[i+1]=-1;
                ans++;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}