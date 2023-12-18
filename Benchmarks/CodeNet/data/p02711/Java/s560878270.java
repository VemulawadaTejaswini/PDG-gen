import java.util.Scanner;
//https://atcoder.jp/contests/abc162/tasks/abc162_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// TODO 自動生成されたメソッド・スタブ
				 Scanner sc = new Scanner(System.in);
				 int name=sc.nextInt();
				 boolean k=false;
				 for(int i=1;i<=3;i++){
					 if(name%10==7)
						 k=true;
					 name=name/10;
				 }
				 if(k){
					 System.out.print("Yes");
				 }else{
					 System.out.print("No");
				 }

	}

}
