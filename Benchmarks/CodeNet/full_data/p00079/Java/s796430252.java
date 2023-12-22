
import java.util.Scanner;

public class Main {
	
	public static final int X = 0;
	public static final int Y = 1;
	public static double[][] pos = new double[20][2];
	public static int len = 0;

	public static void main(String[] args) {
		doIt();
	}
	
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.next();
			String[] ss = s.split(",");
			pos[len][X] = Double.parseDouble(ss[X]);
			pos[len][Y] = Double.parseDouble(ss[Y]);
			len++;
//			if(len == 5){
//				break;
//			}
			//System.out.println(len);
		}
		int[] array = new int[len];
		for(int i = 0; i < len; i++){
			array[i] = i;
		}
		System.out.println(getArea(array,len));
	}
	//点startからendで構成される図形の面積を返す
	public static double getArea(int[] array, int level){
		//System.out.println("level = " + level);
		//print(array);
		double ans = 0;
		if(level == 3){
			//startから連続した3点から面積を計算
			double[] edge = new double[3];
			double z = 0;
			for(int i = 0; i < 3; i++){
				int a = i;
				int b;
				if(i == 2){
					b = 0;
				}
				else{
					b = i + 1;
				}
				edge[i] = Math.sqrt(Math.pow(pos[array[a]][X] - pos[array[b]][X], 2) + Math.pow(pos[array[a]][Y] - pos[array[b]][Y], 2));
				z += edge[i];
			}
			//ヘロンの公式
			z /= 2;
			ans = z * (z - edge[0])* (z - edge[1])* (z - edge[2]);
			ans = Math.sqrt(ans);
		}
		else{
			if(level % 2 == 0){
				int t = level / 2;
				int[] front = new int[t + 1];
				System.arraycopy(array, 0, front, 0, t + 1);
				ans += getArea(front, t + 1);
				int[] back = new int[t + 1];
				System.arraycopy(array, t, back, 0, t);
				back[t] = array[0];
				ans += getArea(back, t + 1);
			}
			else{
				int t = level / 2;
				int[] front = new int[t + 1];
				System.arraycopy(array, 0, front, 0, t + 1);
				ans += getArea(front, t + 1);
				int[] back = new int[t + 2];
				System.arraycopy(array, t, back, 0, t + 1);
				back[t + 1] = array[0];
				ans += getArea(back, t + 2);
			}
		}
		return ans;
	}
	public static void print(int[] a){
		for(int n : a){
			System.out.print(n + " ");
		}
		System.out.println();
		
	}
}