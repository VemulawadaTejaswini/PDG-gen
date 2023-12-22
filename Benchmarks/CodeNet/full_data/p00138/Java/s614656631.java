import java.util.*;
public class Main {
	public static void doIt(){
		Scanner in = new Scanner(System.in);
		data pp[][] = new data[3][8];
		for(int i=0;i<3;i++){
			for(int s=0;s<8;s++){
				int ban=in.nextInt();
				double time=in.nextDouble();
				pp[i][s]=new data(ban,time);
			}
			Arrays.sort(pp[i]);
		}
		for(int i=0;i<3;i++){
			System.out.printf("%d %.2f\n",pp[i][0].code,pp[i][0].time);
			System.out.printf("%d %.2f\n",pp[i][1].code,pp[i][1].time);
		}
		data ans[]=new data[18];
		int cnt=0;
		for(int i=0;i<3;i++){
			for(int s=2;s<8;s++){
				ans[cnt]=pp[i][s];
				cnt++;
			}
		}
		Arrays.sort(ans);
		System.out.printf("%d %.2f\n",ans[0].code,ans[0].time);
		System.out.printf("%d %.2f\n",ans[1].code,ans[1].time);
	}
	public static void main(String[] args) {
		Main.doIt();
	}
	static class data implements Comparable<data>{
		int code;
		double time;
		data(int code,double time){
			this.code=code;
			this.time=time;
		}
		public int compareTo(data o) {
			return Double.compare(this.time,o.time);//これで比べられる。
		}
	}
}