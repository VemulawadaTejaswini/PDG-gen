//GoldenCoins2.java
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int sum500=0;
        int ans500=0;
        int sum5=0;
        int ans5=0;
        //if(x==0){
            //System.out.println(0);
        //}
        
        if(x>=500){        
            for(int i=1; i<=10000000; i++){
                sum500=x-(500*i);
                if(x/500==0){
                    ans500=0;
                    break;
                }
                ans500++;
                if(sum500<500){
                    break;
                }
            }
            //System.out.println(ans500);
            //System.out.println(ans500*1000);
            if(sum500>=5){
                for(int i=1; i<=10000000; i++){
                    sum5=sum500-(5*i);
                    if(sum500/5==0){
                        ans5=0;
                        break;
                    }
                    ans5++;
                    if(sum5<5){
                        break;
                    }
                }
            }
            else{
                ans5=0;
            }
        }
        else{
            ans500=0;
        }
        System.out.println((ans500*1000)+(ans5*5));
        sc.close();
    }
}