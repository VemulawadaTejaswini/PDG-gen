import java .util.Scanner;
 
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());//高橋体力
    	int b = Integer.parseInt(sc.next());//高橋攻撃
		int c = Integer.parseInt(sc.next());//青木体力
    	int d = Integer.parseInt(sc.next());//青木攻撃

 		while(true){
			c -= b;
			if(c <= 0){
				System.out.println("Yes");
				break;
			}

			a -= d;
			if(a <= 0){
				System.out.println("No");
				break;
			}
		}
}