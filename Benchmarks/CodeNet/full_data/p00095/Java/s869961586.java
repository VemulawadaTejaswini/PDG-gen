import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a;
		int v;
		int maxPtr=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			a=sc.nextInt();
			v=sc.nextInt();
			if(v>max){
				max=v;
				maxPtr=a;
			}else if(max==v&&a<maxPtr){
				max=v;
				maxPtr=a;
			}
		}
		System.out.println(maxPtr+" "+max);
	}
}