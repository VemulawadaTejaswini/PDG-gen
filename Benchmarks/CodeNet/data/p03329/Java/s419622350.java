import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner s = new Scanner(System.in);
		//0<=num<=100000
		int num = s.nextInt();
		int count=0;
		int[] deg = {1,6,9,36,81,216,729,1296,6561,7776,46656,59049};
		do{
			if(num>=deg[11]){
				num = num-deg[11];
			}else if(num<deg[11]&&num>=deg[10]){
				num = num-deg[10];
			}else if(num<deg[10]&&num>=deg[9]){
				num = num-deg[9];
			}else if(num<deg[9]&&num>=deg[8]){
				num = num-deg[8];
			}else if(num<deg[8]&&num>=deg[7]){
				num = num-deg[7];
			}else if(num<deg[7]&&num>=deg[6]){
				num = num-deg[6];
			}else if(num<deg[6]&&num>=deg[5]){
				num = num-deg[5];
			}else if(num<deg[5]&&num>=deg[4]){
				num = num-deg[4];
			}else if(num<deg[4]&&num>=deg[3]){
				num = num-deg[3];
			}else if(num<deg[3]&&num>=deg[2]){
				num = num-deg[2];
			}else if(num<deg[2]&&num>=deg[1]){
				num = num-deg[1];
			}else if(num<deg[1]&&num>=deg[0]){
				num = num-deg[0];
			}else break;
			//操作回数カウント
			count++;
		}while(num>0);
		System.out.println(count);
	}
}