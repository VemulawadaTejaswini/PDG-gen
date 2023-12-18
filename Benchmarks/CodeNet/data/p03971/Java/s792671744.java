import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			String str=sc.next();
			int pt=0,os=1;
			for(int i=0;i<n;i++){
				if(str.charAt(i)=='a'){
					if(pt<a+b){
						System.out.println("Yes");
						pt++;
					}
					else System.out.println("No");
				}
				else if(str.charAt(i)=='b'){
					if(pt<a+b && os<=b){
						System.out.println("Yes");
						pt++;
						os++;
					}
					else System.out.println("No");
				}
				else System.out.println("No");
			}
		}
	}
}