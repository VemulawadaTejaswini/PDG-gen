//Grouping2.java
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int ans=0;
        if(n<3){
            System.out.println('0');
        }
        else{
            for(int i=0;i<n;i++){
                int sum=n-3*(i+1);
                ans++;
                if(sum<3){
                    break;
                }
            }
            System.out.println(ans);
        }      
        sc.close();
    }
}