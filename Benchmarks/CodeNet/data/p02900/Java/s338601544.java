import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){//double 处理果盘
		Scanner in = new Scanner(System.in);
		int a = in.nextInt(),b = in.nextInt();
		t1(a,b);
	}
	public static void t1(int n1,int n2){
//		double max = Math.sqrt(n2);
		int dline = n1>n2?n2:n1;
		List num = new ArrayList<>();
		for (int i = 1;i <= dline ;i++){
			if (n1 % i==0 && n2 % i == 0){
				num.add(i);
			}
		}
		int i1 = 1;
		boolean f = false;
		while(num.size()>1){
			f = false;
			int tar = num.size()-i1;
			int t = (int) num.get(tar);
			for (int i=1;i<tar;i++){
				if((int)num.get(i)!= 1 && t % (int)num.get(i) == 0){
					num.remove(tar);
					f = true;
					break;
				}
			}	
			if (f)
			{}
			else{
				++i1;
			}
			if(tar <= 3)
				break;
		}
		System.out.println(num.size());
	}
}	
	