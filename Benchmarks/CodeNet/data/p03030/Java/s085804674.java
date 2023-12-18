import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		uu[] t=new uu[n];
		for(int i=0; i<n; i++){
			String k= sc.next();
			int p=sc.nextInt();
			t[i]=new uu(i+1,k,p);
		}
		Arrays.sort(t,Comparator.comparing(uu::getP).reversed());
		Arrays.sort(t,Comparator.comparing(uu::getK));
		for(int i=0; i<n; i++){
			System.out.println(t[i].getNum());
		}
	}
	public static class uu{
		int num=0;
		String k="";
		int p=0;
		public uu(int num,String k,int p){
			this.num=num;
			this.k=k;
			this.p=p;
		}
		int getNum(){
			return this.num;
		}
		String getK(){
			return this.k;
		}
		int getP(){
			return this.p;
		}
	}
}
