import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				long X = sc.nextLong();
				//何年後か数える変数と貯金100円設定
				int count = 0;
				double Saving = 100;
				//利子1％をし、小数点以下切り捨て
				//Xと貯金額（X）が同じになるまで繰り返す。
				while(Saving <= X) {
					Saving = Saving * 1.01;
					Saving = Math.floor(Saving);
					count++;
					//System.out.println(count);
				}
				//何年後か出力
				System.out.println((int)count);
			}
		}