import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import static java.lang.Math.*;
import java.awt.geom.Point2D;
import java.io.PrintWriter;
class Main{
	static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	static int temp;
	static  boolean lel = true;
	public static void main(String[] args) {
		while(sc.hasNext()){
			int count = 0;
			temp = sc.nextInt();
			int n = sc.nextInt();
			ArrayList  putting= new ArrayList<Integer>();
			LinkedList  dp = new LinkedList<Integer>();
			int money[] = new int [n];
			for(int i = 0; i < money.length; i++){
				money[i] = sc.nextInt();
			}
			solve(putting,dp,money);
		}
	}
	static void solve(List putting, List dp , int money[]){
		for(int i = 0; i < money.length; i++){
			for(int j = i + 1; j < money.length; j++){
				if(!judge(money[i] + money[j])){
					dp.add(money[i] + money[j]);
				}else{
					System.out.println(2);
					lel=!lel;
				}
			}
		}
		int count = 2;
		while(lel){
			count++;
			for(int i = 0; i < money.length ; i++){
				for(int j = i; j < dp.size() ; j++){
					if(!judge(money[i] + (int)dp.get(j))){
						putting.add(money[i] + (int)dp.get(j));
						
					}else if(lel){
						System.out.println(count);
						lel = false;
					}
				}
			}
			dp.clear();
			dp = putting;
			putting.clear();
		}

	}
	static boolean judge(int tmp){
		if(temp == tmp)return true;
		else return false;
	}
}