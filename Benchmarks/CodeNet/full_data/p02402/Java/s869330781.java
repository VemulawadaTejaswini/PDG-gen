import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt();
		int i,min=1000000,max=-1000000,s=0;
		for(i=0;i<n;i++){
			int a=stdIn.nextInt();
			if(min>a)min=a;
			if(max<a)max=a;
			s+=a;
		}
		System.out.println(min+" "+max+" "+s);
	}
}
