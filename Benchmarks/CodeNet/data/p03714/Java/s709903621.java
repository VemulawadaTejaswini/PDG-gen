import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	int N;
	int[]a;
	void solve(){
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		a=new int[3*N];
		for(int i=0;i<3*N;i++){
			a[i]=Integer.parseInt(sc.next());
		}
		ArrayList<Integer> front=new ArrayList();
		ArrayList<Integer> middle=new ArrayList();
		ArrayList<Integer> end=new ArrayList();
		for(int i=0;i<N;i++)front.add(a[i]);
		for(int i=0;i<N;i++)middle.add(a[N+i]);
		for(int i=0;i<N;i++)end.add(a[N*2+i]);
		
		front.sort(Comparator.reverseOrder());
		end.sort(Comparator.reverseOrder());
		
		for(int i=0;i<N;i++){
			int sa=middle.get(0)-front.get(front.size()-1);
			int sb=end.get(0)-middle.get(middle.size()-1);
			if(sa>sb){
				front.remove(front.size()-1);
				int index=0;
				for(int j=0;j<N-1;j++){
					if(front.get(j)<middle.get(0)){
						index=j;
						break;
					}
				}
				front.add(index,middle.get(0));
				middle.remove(0);
			}else{
				end.remove(0);
				int index=0;
				for(int j=0;j<N-1;j++){
					if(end.get(j)<middle.get(middle.size()-1)){
						index=j;
						break;
					}
				}
				end.add(index,middle.get(middle.size()-1));
				middle.remove(middle.size()-1);
			}
		}
		int sumf=0;
		int sume=0;
		
		for(int i=0;i<N;i++){
			sumf+=front.get(i);
			sume+=end.get(i);
		}
		System.out.println(sumf-sume);
	}
}
