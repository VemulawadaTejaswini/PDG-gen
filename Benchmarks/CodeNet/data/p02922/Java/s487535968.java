import java.util.*;

public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		int total=a;
		int count=1;
		for(int i=0;;i++){
			if(total>=b){
				break;
			}
			total+=a-1;
			count++;
		}
		System.out.println(count);

	}
}
