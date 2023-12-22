import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			int a=2004;
			int s=sc.nextInt();
			int d=sc.nextInt();
			if(s==0&&d==0)break;
			if(s==1||s==2){a-=1;s+=13;}
			else if(s>=3)s+=1;
			//System.out.println(s+" "+a+" "+d);
			double A=Math.floor(a*365.25);
			double B=Math.floor(s*30.6);
			double C=Math.floor(a/400);
			double D=Math.floor(a/100);
			double E=A+B+C+d-D-429;
			double EE=Math.floor(E/7);
			double F=EE*7;
			//System.out.println(E+" "+F+" "+EE);
			double ans=E-F;
			//System.out.println(ans);
			if(ans==0)System.out.println("Monday");
			else if(ans==1)System.out.println("Tuesday");
			else if(ans==2)System.out.println("Wednesday");
			else if(ans==3)System.out.println("Thursday");
			else if(ans==4)System.out.println("Friday");
			else if(ans==5)System.out.println("Saturday");
			else if(ans==6)System.out.println("Sunday");
		}	
	}
}