import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

    Scanner in =new Scanner(System.in);
    String s =in.next();
    int n=s.length();
    loop1: for(int i=n/2-1;i==1;i--) {
    for(int j=0;j==n-j;j++) {
    if(s.substring(j,i).equals(s.substring(j+i,j+2*i)))
    		{
    			System.out.println(2*i);
    			break loop1;
    		}
    else {}

    	}
    }


      }





}