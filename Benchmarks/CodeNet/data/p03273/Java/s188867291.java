import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws FileNotFoundException{
		FScanner sc=new FScanner();
		//Scanner sc=new Scanner(System.in);
		
		int[] num=sc.readIntL();
		int h=num[0];
		int w=num[1];
		
		String[][] grid=new String[4][4];
		
		for(int i=0; i<h; i++){
			grid[i]=sc.readStringL("");
		}
		
		trimRow(grid,h,w);
	}
	
	static void trimRow(String[][] grid, int h, int w){
		
		List<Integer> row=new ArrayList<Integer>();
		for(int i=0; i<h; i++){
			boolean wht=true;
			for(int j=0; j<w; j++){
				if(grid[i][j].equals("#")){
					wht=false;
				}
			}
			if(wht==true){
				row.add(i);
			}
		}
		
		String[][] ngrid=new String[h-row.size()][w];
		
		int cpy=0;
		
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				if(row.indexOf(i)==-1){
					ngrid[cpy][j]=grid[i][j];
				}
			}
			if(row.indexOf(i)==-1){
				cpy++;
			}
		}
		trimCol(ngrid,h-row.size(),w);
	}
	
	static void trimCol(String[][] grid, int h, int w){
		
		List<Integer> col=new ArrayList<Integer>();
		for(int j=0; j<w; j++){
			boolean wht=true;
			for(int i=0; i<h; i++){
				if(grid[i][j].equals("#")){
					wht=false;
				}
			}
			if(wht==true){
				col.add(j);
			}
		}
		
		String[][] ngrid=new String[h][w-col.size()];
		
		int cpy=0;
		
		for(int j=0; j<w; j++){
			for(int i=0; i<h; i++){
				if(col.indexOf(j)==-1){
					ngrid[i][cpy]=grid[i][j];
				}
			}
			if(col.indexOf(j)==-1){
				cpy++;
			}
		}
		for(String[] c: ngrid){
			disp(c);
		}
	}

	static void disp(int[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
		}
			System.out.println();
	}
	
	static void disp(String[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%s ",data[i]);
		}
			System.out.println();
	}
	
	static class FScanner{
		Scanner sc;
		FScanner() throws FileNotFoundException{
			sc=new Scanner(System.in);
		}
		boolean hasNextLine(){
			boolean has=true;
			if(!sc.hasNextLine()){
				has=false;
			}
			return has;
		}
		int readInt(){
			int i=sc.nextInt();
			return i;
		}
		long readLong(){
			long i=Long.parseLong(sc.nextLine());
			return i;
		}
		int[] readIntL(){
			String[] buf=sc.nextLine().split(" ");
			int[] num=new int[buf.length];
			for(int i=0; i<buf.length; i++){
				num[i]=Integer.parseInt(buf[i]);
			}
			return num;
		}
		
		String readString(){
			return sc.nextLine();
		}
		String[] readStringL(String dlm){
			String[] s=sc.nextLine().split(dlm);
			return s;
		}
	}
}
