import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>difficulty=new ArrayList<>();
		
		//問題数
		int N=sc.nextInt();
		
		//ABC問題のカウント
		int abcCount=0;
		//ARC問題のカウント
		int arcCount=0;
		//問題の数がABC、ARCともに一緒の時カウント
		int equalCount=0;
		double halfLine;
		
		//問題の難易度
		for(int i=0;i<N;i++) {
			difficulty.add(sc.nextInt());
		}
		
		int difficultyMax=Collections.max(difficulty);
		halfLine=difficulty.size();
		halfLine=halfLine/2;
		
		//難易度に応じた振り分け
		for(int i=1;i<=difficultyMax;i++) {
			for(int j=0;j<difficulty.size();j++) {
				if(halfLine<arcCount||halfLine<abcCount) {
					break;
				}
				if(difficulty.get(j)>=i) {
					arcCount++;
				}else {
					abcCount++;
				}
			}
				
				if(arcCount==abcCount) {
					equalCount++;
				}
				
	
			arcCount=0;
			abcCount=0;
		}
		System.out.println(equalCount);
		
	}
 
}