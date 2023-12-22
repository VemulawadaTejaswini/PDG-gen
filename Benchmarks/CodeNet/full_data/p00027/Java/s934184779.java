import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m,d,i,sum=0,x;
		int manth[]={0,31,29,31,30,31,30,31,31,30,31,30,31};
		while(true){
			m=s.nextInt();
			d=s.nextInt();
			if(m==0 && d==0) break;
			
			for(i=1;i<m;i++){
				sum+=manth[i];
			}
			sum=sum+(d-1);
			x=sum%7;
			if(x==0)
				System.out.println("Thursday");
			if(x==1)
				System.out.println("Friday");
			if(x==2)
				System.out.println("Saturday");
			if(x==3)
				System.out.println("Sunday");
			if(x==4)
				System.out.println("Monday");
			if(x==5)
				System.out.println("Tuesday");
			if(x==6)
				System.out.println("Wednesday");
			sum=0;
		}
	}

}