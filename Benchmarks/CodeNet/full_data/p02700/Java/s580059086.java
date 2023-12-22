import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a =scn.nextInt();
		int b =scn.nextInt();
		int c =scn.nextInt();
		int d =scn.nextInt();
		boolean flag=false;
		while(c>0&& a>0){
			if(!flag &&c-b<=0){
				break;
			}else{
				if(flag &&a-d<=0){
					break;
				}
			}
			if(!flag){
				c-=b;
			}else{
				a-=d;
			}
			flag=!flag;
		
			
		}
		if(!flag){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}

}