import java.util.Scanner;	
public class Main 	
{	
    public static void main(String args[])	
    {	
        String str;	
        Scanner sc = new Scanner(System.in);	
        while(true){	
            str=sc.nextLine();	
            if(str.equals("0")) break;	
            int sum = 0;	
            for(int i=0;i<str.length();i++){	
                 sum+=str.charAt(i)-'0';	
            }	
            System.out.println(sum);	
        }	
    }	
}	
	
