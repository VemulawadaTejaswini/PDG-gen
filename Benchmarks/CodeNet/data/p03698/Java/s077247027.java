import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		int flag=0;
		Scanner in=new Scanner(System.in);
		a=in.nextLine();
		for(int i=0;i<a.length();i++)
		{
			for(int j=i+1;j<a.length();j++)
			{
				if(a.charAt(i)==a.charAt(j))
					flag=1;
				break;
			}
		}
		if(flag==1)System.out.println("no");
		else System.out.println("yes");
   
	}

}
