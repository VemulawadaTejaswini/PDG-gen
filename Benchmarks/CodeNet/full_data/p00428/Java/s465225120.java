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
            int num,cnt;
            public Data(int num,int cnt) {
                this.num = num;
                this.cnt = cnt;
            }
        }
		void sort(Data data[],int m){
			Data temp;
			for(int i = 1;i < m;i++){
				for(int j = i;j > 0;j--){
					if(data[j].cnt > data[j-1].cnt){
						temp = data[j];
						data[j] = data[j-1];
						data[j-1] = temp;
					}
				}
			}
		}
		void doIt(){
			while(true){
				int i,j;
				int n = sc.nextInt();
				int m = sc.nextInt();
				if(n + m == 0)break;
				Data data[] = new Data [m];
				for(i = 0;i < m;i++)data[i] = new Data(i+1,0);
				for(i = 0;i < n;i++){
					for(j = 0;j < m;j++){
						data[j].cnt = data[j].cnt + sc.nextInt();
					}
				}
				sort(data,m);
				for(i = 0;i < m-1;i++)System.out.print(data[i].num+" ");
				System.out.println(data[m-1].num);
			}
		}
	}
}