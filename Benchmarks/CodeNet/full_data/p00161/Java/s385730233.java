import java.util.*;
 
public class Main {
	Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) {
		new Main();	
	}
 
	public Main() {
		new A().doIt();
	}
	class A{
		class Data{
			int num,time;
			public Data(int num,int time) {
				this.num = num;
				this.time = time;
			}
		}
		void sort(Data data[],int n){
			for(int i = 1;i < n;i++){
				for(int j = i;j > 0;j--){
					if(data[j].time < data[j-1].time){
						Data temp = data[j];
						data[j] = data[j-1];
						data[j-1] = temp;
					}
				}
			}
		}
		void doIt(){
			while(true){
				int n = sc.nextInt();
				if(n == 0)break;
				Data data[] = new Data[n];
				for(int i = 0;i < n;i++){
					int num = sc.nextInt();
					int time = (sc.nextInt()*60) + sc.nextInt();
					time = time + (sc.nextInt()*60) + sc.nextInt();
					time = time + (sc.nextInt()*60) + sc.nextInt();
					time = time + (sc.nextInt()*60) + sc.nextInt();
					data[i] = new Data(num,time);
				}
				sort(data,n);
				System.out.printf("%d\n%d\n%d\n",data[0].num,data[1].num,data[n-2].num);
			}
		}
	}
}