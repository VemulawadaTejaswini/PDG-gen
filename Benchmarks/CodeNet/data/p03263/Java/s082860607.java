import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int W = in.nextInt();
		ArrayList<Integer> x1=new ArrayList<Integer>();
		ArrayList<Integer> y1=new ArrayList<Integer>();
		ArrayList<Integer> x2=new ArrayList<Integer>();
		ArrayList<Integer> y2=new ArrayList<Integer>();
		int count=0;
		int a[][] =new int[H][W];
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				a[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				if(W>1&&a[i][j]%2==1&&W-1>j) {
					a[i][j]-=1;
					a[i][j+1]+=1;
					count++;
					x1.add(i+1);
					y1.add(j+1);
					x2.add(i+1);
					y2.add(j+2);
					
				}else if(H>1&&a[i][j]%2==1&&H-1>i){
					a[i][j]-=1;
					a[i+1][j]+=1;					
					count++;
					x1.add(i+1);
					y1.add(j+1);
					x2.add(i+2);
					y2.add(j+1);
				}
			}
		}
		System.out.println(count);
		for(int i=0;i<x1.size();i++) {
			System.out.println(x1.get(i)+" "+y1.get(i)+" "+x2.get(i)+" "+y2.get(i));
		}
		
	}
}