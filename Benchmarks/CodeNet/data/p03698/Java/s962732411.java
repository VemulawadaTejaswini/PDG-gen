import java.util.Scanner;
public class abc63b {
	static void sort(String[] a){
		String x;
		int cnt=0;

		for(int i=a.length-1;i>0;--i){
			for(int j=0;j<i;++j){
				for(int k=0;k<(a[j].length()>a[j+1].length()?(a[j+1].length()-1):(a[j].length()-1));++k){
				if(((a[j].charAt(k))<(a[j+1].charAt(k)))){
					break;
				}else if(((a[j].charAt(k))==(a[j+1].charAt(k)))){
					boolean h=true;
					for(int m=1;m<(a[j].length()>a[j+1].length()?(a[j+1].length()-1):(a[j].length()-1));++m){
					if(((a[j].charAt(k+m))<(a[j+1].charAt(k+m)))){
						h=false;
						break;
					}else if(h=true){

						if(a[j].length()>a[j+1].length()){x=a[j];a[j]=a[j+1];a[j+1]=x;cnt++;break;}
						else{break;}
					}
					}

				}else{

					x=a[j];a[j]=a[j+1];a[j+1]=x;
					cnt++;

					break;
				}

				}

			}
			if(cnt==0){break;}
			cnt=0;
		}
		
		return;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		String[] x=new String[27];
		for(int i=0;i<x.length;++i){
			x[i]=stdin.next();
		}
		sort(x);
		boolean y=true;
		for(int i=1;i<x.length;++i){
			if(x[i].equals(x[i-1])){
				System.out.println("no");
				y=false;
				break;
			}
			if(y==true)System.out.println("yes");
		}
	}

}
