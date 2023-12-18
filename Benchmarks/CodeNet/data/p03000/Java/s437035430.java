import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
	
		Scanner scn=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		
		int x=scn.nextInt();
		int y=scn.nextInt();
		
		for(int i=0;i<x;i++) {
			
			int z=scn.nextInt();
			
			list.add(z);
		}
		
		int count=0;
		int s=0;
		for(Integer i:list) {
			
			if(s<=y) {
				s=s+i;
				count++;
			}else {
				break;
			}
			
		}
		System.out.println(count);
		
		
		scn.close();
	}
}