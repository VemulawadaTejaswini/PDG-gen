import java.util.Scanner;
public class Main {
	public static void main(String[]args){
		Scanner s =new Scanner(System.in);
		while(s.hasNext()){
			int a =s.nextInt();
			int b =s.nextInt();
			int[] y =yakusu(a);
			int[] z =yakusu(b);
			int n=kobaisu(z,y);
			int m=koyakusu(z,y);
			System.out.println(Integer.toString(m)+" "+Integer.toString(n));
		}
	}
	public static int[] yakusu(int a){
		int[] l =new int[a];
		int counta=0;
		for(int i=2;i<=a;i++){
			if(a%i==0){
				l[counta]=i;
				counta++;
				a=a/i;
				i--;
			}
		}
		int[] y=new int[counta];
		for(int j=0;j<counta;j++){
			y[j]=l[j];
		}
		return y;
	}
	
	public static boolean sosu(int a){
		for(int j=2;j<=a;j++){
			if(a==j){
				return true;
			}else if(a%j==0)return false;
		}
		return false;
	}
	public static int kobaisu(int[] a,int[] b){
		int n=1;
		int j=0,i=0;
		
		while(i<a.length&&j<b.length){
			if(a[i]==b[j]){
				n=n*a[i];
				i++;j++;
			}else if(a[i]>b[j]){
				n=n*b[j];
				j++;		
			}else if(a[i]<b[j]){
				n=n*a[i];
				i++;
			}
		}
		while(i<a.length){
			n=n*a[i];
			i++;
		}
		while(j<b.length){
			n=n*b[j];
			j++;
		}
		return n;
	}
	public static int koyakusu(int[] a,int[] b){
		int n=1;
		int i=0,j=0;
		while(i<a.length&&j<b.length){
			if(a[i]==b[j]){
				n=n*a[i];
				i++;j++;
			}else if(a[i]>b[j]){
				j++;		
			}else if(a[i]<b[j]){
				i++;
			}
		}
		
		return n;
	}
}