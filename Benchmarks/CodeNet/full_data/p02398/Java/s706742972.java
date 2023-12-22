import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String[] list;
		while(sc.hasNextLine()){
			list =sc.nextLine().split(" ");
		}
		int a=Integer.parseInt(line[0]);
		int b=Integer.parseInt(line[1]);
		int c=Integer.parseInt(line[2]);
		
		int count=0;
		for(int i=a;i<=b;i++){
			if(c%i==0){
				count++;
			}
		}
		System.outnprintln(count);
	}
}