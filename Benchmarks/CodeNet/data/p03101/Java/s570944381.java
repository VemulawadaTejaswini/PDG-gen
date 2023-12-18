import java.util.*;
public class Main{
	public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int row=sc.nextInt();
     int col=sc.nextInt();
     int n=sc.nextInt();
     int m=sc.nextInt();
     System.out.println((row*col)-(n*col)-(m*row)); 
    } 
}