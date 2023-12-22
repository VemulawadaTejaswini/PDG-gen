import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		while(true){
			int n = in.nextInt();
			if(n==0)break;
			new AOJ1175().doIt(n);
		}
	}


	class AOJ1175{
		void doIt(int n){
			boolean[] memo = new boolean[(1<<n)];
			Arrays.fill(memo,false);
			Data[] data = new Data[n];
			for(int i=0;i<n;i++)data[i] = new Data(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
			long bit = 0;
			for(int i=0;i<n;i++)bit += 1 << i;
			LinkedList<State> q = new LinkedList<State>();
			q.add(new State(bit, 0));
			int cnt[] = new int[n];
			int result = -1;
			while(q.size()>0){
				State now = q.remove();
//				System.out.println(bit);
				bit = now.bit;
				if(memo[(int)bit])continue;
				memo[(int)bit] = true;
				result = Math.max(result, now.num);
//				System.out.println(Long.toBinaryString(bit));
				boolean sw = false;
				Arrays.fill(cnt,0);
				for(int i=0;i<n;i++)for(int s=i-1;s>=0;s--)if((bit>>i)%2==1&&(bit>>s)%2==1){
					if(Point2D.distance(data[i].x, data[i].y, data[s].x, data[s].y)<data[s].r+data[i].r)cnt[i]++;
				}
//				System.out.println(Arrays.toString(cnt));
				for(int c=1;c<=4;c++){//color
					for(int i=0;i<n;i++)for(int s=i+1;s<n;s++)if(data[i].color==c&&data[s].color==c&&cnt[i]==0&&cnt[s]==0){
						if(i==s||((bit>>i)%2==0)||((bit>>s)%2==0))continue;
						long bit2 = bit-(1<<i)-(1<<s);
//						System.out.println(bit2);
						q.add(new State(bit2,now.num+2));
						sw = true;
					}
				}
				if(sw==false)break;
			}
			System.out.println(result);
		}
		
		class State{
			long bit;
			int num;
			public State(long bit,int num){
				this.bit = bit;
				this.num = num;
			}
		}

		class Data{
			int x,y,color,r;
			public Data(int x,int y,int r,int color) {
				this.x = x;
				this.y = y;
				this.r = r;
				this.color = color;
			}
		}
	}
}