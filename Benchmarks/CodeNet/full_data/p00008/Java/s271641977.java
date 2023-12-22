import java.util.Scanner;

public class Main {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	int a,b,c,d;
	int count=0;
	for(a=0;a<10;a++) {
		if((n-a)<=27) {
			for(b=0;b<10;b++) {
				if((n-a-b)<=18)
					for(c=0;c<10;c++) {
						if((n-a-b-c)<=9)
								for(d=0;d<10;d++)
								{
									if((a+b+c+d)==n)
										count++;
								}
					}
			}
			
		}	
	}
	System.out.println(count);
}
}