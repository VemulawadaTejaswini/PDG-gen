import java.util.Scanner;
class Main{ 	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		int a[]=new int[N];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<a.length;i++){
			x-=a[i];
			if(x<=0){
				break;
			}
			count++;	
		}
		System.out.println(count);
	}
}