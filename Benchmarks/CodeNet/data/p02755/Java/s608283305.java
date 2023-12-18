import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans1=0;
        double sum1=0;
        
        for(int i=1; i<=100; i++){
            sum1=i*0.08;
            int sum3=(int)sum1;
            ans1++;
            if(sum3==a){
                break;
            }
        }
        double sum5=ans1*0.1;
        int sum6=(int)sum5;
        if(sum6==b){
            System.out.println(ans1);
        }
        else{
            System.out.println(-1);
        }
        sc.close();
    }
}