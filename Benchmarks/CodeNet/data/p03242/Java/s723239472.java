import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		String N=sc.nextLine();
		char t[]=N.toCharArray();
		for(int i=0;i<t.length;i++){
			if(t[i]==1){
				t[i]=9;
				break;
			}else if(t[i]==9){
				t[i]=1;
			}
		}
	}

}