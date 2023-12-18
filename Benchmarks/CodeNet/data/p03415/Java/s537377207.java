import java.util.*;
public class Main {
	public static void main(String[] args){
    //データ取り込み
		Scanner sc = new Scanner(System.in);
		//String S = sc.next();
    //int B = sc.nextInt();
    //System.out.println();
		String S1[]= new String[9];
		for(int i=0;i<9;i++){
			S1[i] =sc.next();
			
		}
		System.out.println(S1[0]+S1[4]+S1[8]);
	}
}