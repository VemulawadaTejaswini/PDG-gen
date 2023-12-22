import java.awt.geom.Point2D;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;
public class Main {	
	Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}

	public Main(){		
		while(in.hasNext())new AOJ0043();
	}
	
	boolean debug;
	
	boolean run(int[] num,int target){
//		System.out.println(target);
//		print(num);
		
		if(target==3)debug=true;
		else debug = false;
		//まず2個の数字を取る
		num[target]++;
		for(int i=1;i<10;i++)if(num[i]>=2){
			num[i]-=2;
			if(bfs(num))return true;
			num[i]+=2;
		}
		num[target]--;
		return false;
	}
	void print(int[] num){
		for(int i=0;i<num.length-1;i++)System.out.print(num[i]+" ");
		System.out.println();
	}
	
	boolean bfs(int num[]){//三枚のトリオを作成していく
//		if(debug)print(num);
		boolean sw = true;
		for(int i=0;i<10;i++)if(num[i]!=0)sw=false;
		if(sw)return true;
		
		//連番
		for(int i=1;i<7;i++)if(num[i]>0&&num[i+1]>0&&num[i+2]>0){
			num[i]-=1;num[i+1]-=1;num[i+2]-=1;
			if(bfs(num))return true;
			num[i]++;num[i+1]++;num[i+2]++;
		}
		
		//三枚
		for(int i=1;i<10;i++)if(num[i]>=3){
			num[i]-=3;
			if(bfs(num))return true;
			num[i]+=3;
		}
		return false;
	}
	
	class AOJ0043{
		public AOJ0043() {
			String a = in.next();
			int[] input = new int[10];
			for(int i=0;i<13;i++)input[Integer.parseInt(a.charAt(i)+"")]++;
			boolean sw[] = new boolean[10];
			for(int i=1;i<10;i++)if(input[i]!=4){
				int[] num = Arrays.copyOf(input,input.length);
				sw[i]=run(num,i);
			}
			int last=0;
			for(int i=9;i>=0;i--)if(sw[i]){
				last=i;break;
			}
			for(int i=0;i<10;i++)if(sw[i]&&i!=last)System.out.print(i+" ");
			System.out.println(last);
		}
	}
	
}