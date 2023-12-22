import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n=cin.nextInt();
		for(int r=0;r<n;r++){
			int x=cin.nextInt();
			System.out.println(max(x)-min(x));
		}
	}
	static int max(int x){
		int ans=0;
		int[] a=new int[10];
		for(int q=0;q<9;q++){
			a[q]=0;
		}
		for(int i=0;i<8;i++){
			a[x%10]=a[x%10]+1;
			x=x/10;
		}
		for(int w=9;w>=0;w--){
			for(int p=0;p<a[w];p++){
			ans=ans*10;
			ans+=w;
			}
		}
		return ans;
	}
	static int min(int x){
		int ans=0;
		int[] a=new int[10];
		for(int q=0;q<9;q++){
			a[q]=0;
		}
		for(int i=0;i<8;i++){
			a[x%10]=a[x%10]+1;
			x=x/10;
		}
		for(int w=0;w<=9;w++){
			for(int p=0;p<a[w];p++){
			ans=ans*10;
			ans+=w;
			}
		}
		return ans;
	}
}