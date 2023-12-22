import java.util.Scanner;

public class Main {

	static int[] tmp1,tmp2,a;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		a = new int[2*n];
		tmp1=new int[2*n];
		tmp2=new int[2*n];
		for(int i=0;i<2*n;i++){
			a[i]=i+1;
		}
		for(int i=0;i<m;i++){
			int k = sc.nextInt();
			if(k==0){
				shuffle();
			}
			else{
				shuffle(k);
			}
		}
		for(int i=0;i<2*n;i++){
			System.out.println(a[i]);
		}
	}
	static void shuffle(){
		int cnt1=0,cnt2=0;
		for(int i=0;i<a.length;i++){
			if(i<a.length/2){
				tmp1[cnt1++]=a[i];
			}
			else{
				tmp2[cnt2++]=a[i];
			}
		}
		cnt1=cnt2=0;
		for(int i=0;i<a.length;i++){
			if(i%2==0){
				a[i]=tmp1[cnt1++];
			}
			else{
				a[i]=tmp2[cnt2++];
			}
		}
	}
	static void shuffle(int k){
		for(int i=0;i<k;i++){
			tmp1[i]=a[i];
//			System.out.println(tmp1[i]);
		}
		for(int i=k;i<a.length;i++){
			tmp2[i]=a[i];
//			System.out.println(tmp2[i]);
		}
		for(int i=k;i<a.length;i++){
			a[i-(k)]=tmp2[i];
		}
		for(int i=0;i<k;i++){
			a[i+(a.length-k)]=tmp1[i];
		}

	}
}