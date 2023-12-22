import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			ArrayList <Integer> temp=new ArrayList<Integer>();
			for(int i=0;i<n;i++){
			temp.add(sc.nextInt());
			
			}
			
			
			
			
			
			Collections.sort(temp);
			temp.remove(0);
			temp.remove(temp.size()-1);
			System.out.println(ans(temp));
		}
	}
	
	
	
	
	
	
	
	public static int ans(ArrayList<Integer> List){
		int sum=0;
		int temp=0;
		for(int i=0;i<List.size();i++){
			sum+=List.get(i);
		}
		temp=sum/List.size();
		return temp;
		
		
	
	}
}