import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Main{
		
	int[][] paper = new int[10][10];
	
	public void new_paper(){
		for(int x=0;x<10;x++){
			for(int y=0;y<10;y++){
				paper[x][y]=0;
			}
		}
	}
	
	public void drop_small(int x1,int y1){
		paper[x1][y1]++;
		if(y1-1 >= 0)
			paper[x1][y1-1]++;
		if(x1-1 >= 0)
			paper[x1-1][y1]++;
		if(x1+1 <= 10)
			paper[x1+1][y1]++;
		if(y1+1 <= 10)
			paper[x1][y1+1]++;
	}
	
	public void drop_medium(int x1,int y1){
		drop_small(x1,y1);
		if(x1-1 >= 0 && y1-1 >= 0)
			paper[x1-1][y1-1]++;
		if(x1+1 <= 10 && y1-1 >= 0)
			paper[x1+1][y1-1]++;
		if(x1-1 >= 0 && y1+1 <= 10)
			paper[x1-1][y1+1]++;
		if(x1+1 <= 10 && y1+1 <= 10)
			paper[x1+1][y1+1]++;
	}
	
	public void drop_large(int x1,int y1){
		drop_medium(x1,y1);
		if(y1-2 >= 0)
			paper[x1][y1-2]++;
		if(x1-2 >= 0)
			paper[x1-2][y1]++;
		if(x1+2 <= 10)
			paper[x1+2][y1]++;
		if(y1+2 <= 10)
			paper[x1][y1+2]++;
	}
	
	public void drop_ink(ArrayList<Integer> list){
		int x1,y1,size;
		new_paper();
		
		for(int i=0;i<list.size()/3;i++){
			x1 = list.get(i*3);
			y1 = list.get(i*3+1);
			size = list.get(i*3+2);
			if(size == 1)drop_small(x1,y1);
			else if(size == 2)drop_medium(x1,y1);
			else drop_large(x1,y1);
		}
	}
	
	public void print_paper(){
		int count_zero,count_max,max;
		count_zero = 0;
		max = 0;
		
		for(int x=0;x<10;x++){
			for(int y=0;y<10;y++){
				if(max < paper[x][y])
					max = paper[x][y];
			}
		}
		
		for(int x=0;x<10;x++){
			for(int y=0;y<10;y++){
				if(paper[x][y] == 0)
					count_zero++;
			}
		
		}
		System.out.println(count_zero);
		System.out.println(max);
	}
		
	public static void main(String args[]) throws IOException{
		String str;
		ArrayList <Integer> inp = new ArrayList<Integer>();

		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
			
			str = scan.next();
			
			String [] strAry = new String[str.length()];
			strAry = str.split(",");
			for(int j=0;j<strAry.length;j++){
				Pattern p = Pattern.compile("[0-9]*");
				Matcher m = p.matcher(strAry[j]);
				if(m.find()){
					int x = Integer.valueOf(m.group(0)).intValue();
					inp.add(x);
				}
			}
		}
		
		Main object = new Main();
		object.drop_ink(inp);
		object.print_paper();
	}
}