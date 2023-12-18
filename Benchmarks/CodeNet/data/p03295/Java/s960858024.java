import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		List<List<Queri>> qss=new ArrayList<>();
		for(int i=0;i<=n;i++){
			qss.add(new ArrayList<Queri>());
		}
		
		int[] a=new int[m];
		int[] b=new int[m];
		for(int i=0;i<m;i++){
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			qss.get(b[i]-1).add(new Queri(a[i],b[i]));
		}
		int cnt=0;
		for(int i=1;i<n;i++){
			for(int j=qss.get(i).size()-1;j>=0;j--){
				Queri q=qss.get(i).get(j);
//				System.out.println(""+q.a+q.b+q.ext);
				if(q.ext){
					for(List<Queri> qs:qss){
						for(Queri q2:qs){
							q2.cut(i);
						}
					}
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}
 
class Queri{
	Queri(int a,int b){
		this.a=a;
		this.b=b;
	}
	int a;
	int b;
	boolean ext=true;
	void cut(int c){
//		System.out.println("cut"+c);
		if(a<=c&&c<b){
			ext=false;
		}
	}
}