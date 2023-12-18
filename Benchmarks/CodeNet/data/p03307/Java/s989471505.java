import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int count=0;
		for(int i=0;i<n1;i++){
		if(count%2==0 && n1%count==0){
			System.out.println(count);
			break;
		}
		count++;
               } 
	}
 
}