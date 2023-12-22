import java.util.Scanner;

public class Main{
	public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int a,i;
        a = sc.nextInt();
        for(i=1;i<a+1;i++){
            if(i%3==0)System.out.print(" "+i);
           	else if(i%3==0&&i%10==0)System.out.print(" "+i);
            else if(i%10==3&&i%10!=0)System.out.print(" "+i);
            else;
        }
   }
}
