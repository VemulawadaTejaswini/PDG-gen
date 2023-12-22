import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ1148().doIt();
	}

	class AOJ1148{
		void doIt(){
			while(true){
				int n = in.nextInt();
				int m = in.nextInt();
				if(n+m==0)break;
				Student student[] = new Student[m];
				for(int i=0;i<m;i++)student[i] = new Student();
				int l = in.nextInt();
				Log[] log = new Log[l];
				for(int i=0;i<l;i++)log[i] = new Log(in.nextInt(), in.nextInt(), in.nextInt(),in.nextInt());
				for(int i=0;i<l;i++){
					if(log[i].sw==1)student[log[i].student-1].get_start(log[i].time);
					else if(log[i].sw==0)student[log[i].student-1].reload(log[i].time);
				}
				int q = in.nextInt();
				for(int i=0;i<q;i++){
					int start = in.nextInt();
					int end = in.nextInt();
					int s = in.nextInt();
					System.out.println(student[s-1].question(start, end));
				}
			}
		}

		class Student{
			boolean[]  memo;
			LinkedList<Integer> start;
			public Student() {
				memo = new boolean[720];
				start = new LinkedList<Integer>();
			}

			int question(int start,int end){
				int result = 0;
				for(int i=start;i<end;i++)if(memo[i-540])result++;
				return result;
			}

			void get_start(int start){
				this.start.add(start);
			}

			void reload(int end){
				int st = start.remove();
				for(int i=st;i<end;i++)memo[i-540] = true;
			}
		}

		class Log{
			int time,pc,student,sw;
			public Log(int t,int pc,int s,int sw) {
				this.time = t;
				this.pc = pc;
				this.student = s;
				this.sw =sw;
			}
		}
	}

}