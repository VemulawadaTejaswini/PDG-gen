import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	int a = N%4;
      	int b = N%7;
      	if(a==0||b==0||b==4){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
    }
}