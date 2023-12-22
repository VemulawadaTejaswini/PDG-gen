import java.util.Scanner;

public class Main{	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int num = 0;
		for(int i=0;i<s.length();i++){
			try{
				num+=Integer.parseInt(s.substring(i,i+1));
			}catch(Exception e){}
			num%=9;
		}
		if(num==0)
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();
	}
}