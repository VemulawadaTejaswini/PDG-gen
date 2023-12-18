import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int x =sc.nextInt();
		int count=0;
		for(int i=0;a<=b;i++){			
			if((a)%x==0){
				count=count+1;
			}
			a=a+1;
		}
		System.out.println(count);
		
	}