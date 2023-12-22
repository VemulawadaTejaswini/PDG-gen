import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Main {
	int n;

	List<List<Integer>> list;


	int T,P,R;

	static class Data{
		int id;
		int success=0;
		int time=0;
	}

	public void run(){
		Scanner sc=new Scanner(System.in);
		while(true){
			T=sc.nextInt();P=sc.nextInt();R=sc.nextInt();

			int[][] wrongCount=new int[T][P+1];

			Data[] data=new Data[T];
			for(int i=0;i<T;i++){
				data[i]=new Data();
				data[i].id=i+1;
			}
			for(int i=0;i<R;i++){
				int t=sc.nextInt();
				int p=sc.nextInt();
				int time=sc.nextInt();
				String type=sc.next();
				if("WRONG".equals(type)){
					wrongCount[t-1][p]++;
				}else{
					data[t-1].success++;
					data[t-1].time+=wrongCount[t-1][p]*1200+time;
				}
			}
			Arrays.sort(data,new Comparator<Data>() {@Override
				public int compare(Data o1, Data o2) {
					if(o1.success!=o2.success){
						return o2.success-o1.success;
					}
					if(o1.time!=o2.time){
						return o2.time-o1.time;
					}
					return o1.id-o2.id;
				}
			});

			for(Data d:data){
				pr(d.id+" "+d.success+" "+d.time);
			}
		}
	}
	public static void main(String[] _) {
		new Main().run();
	}

	public static void pr(Object o){
		System.out.println(o);
	}
}