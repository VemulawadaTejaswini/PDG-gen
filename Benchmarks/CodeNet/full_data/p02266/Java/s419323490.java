import java.io.UnsupportedEncodingException;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String mark = scanner.next();
		int num = mark.length();
		
		SectionDiagram(mark, num, scanner);
		
	}
	//enum宣言
	public static enum Operate{
		back(92),
		slush(47),
		under(95);
		
		private final int mark;
		
		private Operate(final int mark) {
			this.mark = mark;
		}
		
		public int getInt(){
			return this.mark;
		}
	}
	public static Operate getOperate(final int id) {
		Operate[] marks = Operate.values();
		for (Operate type : marks) {
			if (type.getInt() == id) {
				return type;
			}
		}
		return null;
	}
	//治水シミュレーション
	public static void SectionDiagram(String mark, int num, Scanner scanner){
		int num_puddle = 0;						//水たまりの数
		int count = 0;							//Whileの周回
		int back_num = 0;							//カウントする￥の数
		int sla_num = 0;							//深さ
		int flap_num = 0;							//折り返した数
		byte[] mark_num = new byte[num];		//switch用格納庫
		
		Deque<Integer> downPos = new ArrayDeque<>();
        Deque<IntPair> downPosPool = new ArrayDeque<>();
         
        int sum_puddle = 0;
		
		try {
			mark_num = mark.getBytes("US-ASCII");
		} catch (UnsupportedEncodingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		while( num > count ){										//文字数文処理
			switch( getOperate(mark_num[count]) ){					//
			case back:
				downPos.push(count);
				break;
			case slush:
				int j = downPos.pop();
				int a = count - j;
				sum_puddle += a;
				while (!downPosPool.isEmpty() && downPosPool.peek().int1 > j) {
					a += downPosPool.pop().int2;
				}
				downPosPool.push(new IntPair(j, a));
				break;
			case under:
				break;
			}
			count ++;
		}
		//出力処理
		int size = downPosPool.size();
        System.out.println(sum_puddle);
        System.out.print(size);
        for (int i = 0; i < size; i++) {
            System.out.print(" ");
            System.out.print(downPosPool.pollLast().int2);
        }
        System.out.println();
	}
	
	static class IntPair {
        int int1;
        int int2;
        IntPair(int i1, int i2) {
            int1 = i1;
            int2 = i2;
        }
    }
}
