
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a= new int[4];
		for(int i=3;i>=0;i--){
			int x=n%10;
			a[i]=x;
			n=n/10;
		}
		System.out.println(a[0]+test(a,0,a[0],String.valueOf(a[0])));

	}

	public static String test(int a[],int i,int Ans,String str){
		if(i==2){
			if(Ans+a[i+1]==7){
				return new String("+"+a[i+1]+"=7");
			}
			if(Ans-a[i+1]==7){
				return new String("-"+a[i+1]+"=7");
			}
			return "";
		}else{
			if(!str.equals("")){
				if(!test(a,i+1,Ans+a[i+1],str).equals("")){
					return new String("+"+a[i+1]+test(a,i+1,Ans+a[i+1],str));
				}
				if(!test(a,i+1,Ans-a[i+1],str).equals("")){
					return new String("-"+a[i+1]+test(a,i+1,Ans-a[i+1],str));
				}
			}
			return "";
		}
	}

}
