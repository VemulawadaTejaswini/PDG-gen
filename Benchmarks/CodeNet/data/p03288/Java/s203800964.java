import java.util.Scanner;
import java.util.Arrays;

public class Main
{

	public static void main(String[] args)
	{	Scanner s = new Scanner(System.in);
                String l = s.next();
                int n = l.length();
                int i=0,j=0,k=0;
                for(i=0;i<n;i++){
                     if(l.charAt(0)=='A'){
                        j=1;
                     }
                     if((i>=2 && i<n-1) && l.charAt(i)=='C'){
                        k=1;
                     }
                }
                if(j==1 && k==1){
                  System.out.println("AC");
                }else{
                  System.out.println("WA");
                }
                
	}
}
