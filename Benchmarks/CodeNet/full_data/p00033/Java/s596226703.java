import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num=new int[10];
		for(int i=0; i<N; i++){
			int l=0;
			int r=0;
			boolean flag=true;
			for(int j=0; j<10; j++){
				num[j]=sc.nextInt();
			}
			for(int j=0; j<10; j++){
				if(l<num[j]){
					l=num[j];
				}else if(r<num[j]){
					r=num[j];
				}else{
					flag=false;
					break;
				}
			}
			if(flag)System.out.println("YES");
			else System.out.println("NO");
		}
	}
}