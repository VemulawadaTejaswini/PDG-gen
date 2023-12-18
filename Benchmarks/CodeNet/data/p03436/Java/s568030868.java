import java.util.Scanner;
import java.util.ArrayDeque;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] a = new char[h][w];
		long black=0;
		ArrayDeque<Integer> queueh = new ArrayDeque<Integer>();
		ArrayDeque<Integer> queuew = new ArrayDeque<Integer>();
		for(int i = 0; i<h; i++){
			String c = sc.next();
			for(int j = 0; j<w; j++){
				a[i][j]=c.charAt(j);
				if(a[i][j]=='#'){
					black++;
				}
			}
		}
		queueh.add(0);
		queuew.add(0);
		long countsub=1;
		long count=1;
		while(!queueh.isEmpty()){
			int i=queueh.poll();
			int j=queuew.poll();
			a[i][j]='#';
			if(a[h-1][w-1]=='#'){
					break;
				}
			if(i!=h-1 && a[i+1][j]!='#'){
				queueh.add(i+1);
				queuew.add(j);
			}
			if(i!=0 && a[i-1][j]!='#'){
				queueh.add(i-1);
				queuew.add(j);
			}
			if(j!=w-1 && a[i][j+1]!='#'){
				queueh.add(i);
				queuew.add(j+1);
			}
			if(j!=0 && a[i][j-1]!='#'){
				queueh.add(i);
				queuew.add(j-1);
			}
			if(countsub==1){
				count++;
				countsub+=queueh.size();
			}
			countsub--;
		}
		if(a[h-1][w-1]!='#'){
			System.out.println(-1);
			return;
		}
		System.out.println(h*w-count-black);
	}
}