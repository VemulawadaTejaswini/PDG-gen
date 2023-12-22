import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static final int H = 0;
	public static final int A = 1;
	public static final int D = 2;
	public static final int S = 3;
	//1回攻撃したダメージ量
	public static final int ACK = 4;
	//1回攻撃を受けたダメージ量
	public static final int DEF = 5;
	//倒すまでのターン数
	public static final int TURN = 6;
	//1ターンの勇者に与えるダメージ
	//public static final int DAM = 5;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		doIt();
		//test();
	}

	public static void test(){
		PriorityQueue<E> queue = new PriorityQueue<E>();
		queue.add(new E(1,3.5));
		queue.add(new E(2,7));
		queue.add(new E(3,1.4));
		while(queue.isEmpty() == false){
			E e = queue.poll();
			System.out.println("i = " + e.i + ", r = " + e.r);
		}

	}

	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] yusya = new int[4];
		yusya[H] = sc.nextInt();
		yusya[A] = sc.nextInt();
		yusya[D] = sc.nextInt();
		yusya[S] = sc.nextInt();
		int[][] enemy = new int[n][7];
		PriorityQueue<E> queue = new PriorityQueue<E>(n);
		//情報のセット
		for(int i = 0; i < n; i++){
			enemy[i][H] = sc.nextInt();
			enemy[i][A] = sc.nextInt();
			enemy[i][D] = sc.nextInt();
			enemy[i][S] = sc.nextInt();
			//iを倒すまでのターン数を計算
			//1会のダメージ
			enemy[i][DEF] = yusya[A] - enemy[i][D];
			//倒せない場合
			if(enemy[i][DEF] <= 0){
				System.out.println(-1);
				return;
			}
			//倒せるまでのターン数の計算
			int h = enemy[i][H];
			enemy[i][TURN] = h / enemy[i][DEF];
			if(h % enemy[i][DEF] > 0){
				enemy[i][TURN]++;
			}

			enemy[i][ACK] = enemy[i][A] - yusya[D];
			if(enemy[i][ACK] <= 0){
				enemy[i][ACK] = 0;
			}
			double r = (double)enemy[i][ACK] / (double)enemy[i][TURN];
			//System.out.println("ack = " + enemy[i][ACK] + "turn = " + enemy[i][TURN] +  ", r = " + r);
			queue.add(new E(i,r));
		}
		//戦闘開始
		//勇者の最適戦略はqueueの戦闘から倒していくこと
		//まず勇者よりスピードの速い敵の攻撃
		//勇者の受けたダメージ
		int dam= 0;
		for(int[] e : enemy){
			if(e[S] > yusya[S]){
				dam += e[ACK];
			}
		}
		if(yusya[H] <= dam){
			System.out.println(-1);
			return;
		}
		int num = n;
		int target = queue.poll().i;
		int sum = 0;
		//総ダメージの計算
		for(int[] e : enemy){
			sum += e[ACK];
		}
		int ret = 0;
		while(true){
			//勇者の行動
			//targetを倒す
			dam += sum*(enemy[target][TURN] - 1);
			if(yusya[H] <= dam){
				ret = -1;
				break;
			}
			num--;
			if(num == 0){
				ret = dam;
				break;
			}
			sum -= enemy[target][ACK];
			dam += sum;
			//次の敵は？
			target = queue.poll().i;
		}
//		while(true){
//			//勇者の行動
//			enemy[target][H] -= enemy[target][DEF];
//			if(enemy[target][H] <= 0){
//				num--;
//				if(num == 0){
//					ret = yusya[H];
//					break;
//				}
//				sum -= enemy[target][ACK];
//				target = queue.poll().i;
//			}
//			//敵の行動
//			yusya[H] -= sum;
//			if(yusya[H] <= 0){
//				ret = -1;
//				break;
//			}
//		}
		System.out.println(ret);
	}

}

class E implements Comparable<E>{
	public int i;
	public double r;
	E(int index, double rate){
		i = index;
		r = rate;
	}

	public int compareTo(E o) {
		// TODO 自動生成されたメソッド・スタブ
		return r < o.r ? 1 : -1;
	}
}