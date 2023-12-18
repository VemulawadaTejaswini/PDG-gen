import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws FileNotFoundException{
		FScanner fs=new FScanner();
		//Scanner sc=new Scanner(System.in);
		
		int[] num=fs.readIntL();
		int[][] tr=new int[num[0]+1][num[0]+1];
		int[][] qs=new int[num[2]][2];
		int[] buf=new int[2];
		for(int i=0; i<num[1]; i++){
			buf=fs.readIntL();
			tr[buf[0]][buf[1]]+=1;
		}
		
		int cnt=0;
		int sum=0;
		
		/*for(int[] row: tr){
			disp(row);
		}
		System.out.println("");*/
		
		int[][] acc=new int[num[0]+1][num[0]+1];
		
		for(int i=0; i<num[0]+1; i++){//start
			for(int j=0; j<num[0]+1; j++){//end
				sum=0;
				for(int k=i; k<=j; k++){
					for(int l=i; l<=j; l++){
						sum+=tr[k][l];
					}
				}
				acc[i][j]=sum;
			}
		}
		
		/*for(int[] row: acc){
			disp(row);
		}
		
		System.out.println("");*/
		
		for(int i=0; i<num[2]; i++){
			buf=fs.readIntL();
			//disp(buf);
			cnt=0;
			System.out.println(acc[buf[0]][buf[1]]);
		}
		
	}
	
	static void solver(){
		
	}

	static void disp(int[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
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
			int i=Integer.parseInt(sc.nextLine());
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
		String[] readStringL(){
			String[] s=sc.nextLine().split("");
			return s;
		}
	}
}
