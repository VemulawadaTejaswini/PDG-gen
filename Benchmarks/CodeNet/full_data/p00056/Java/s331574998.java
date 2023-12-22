import java.util.ArrayList;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int n,count;
		boolean is;
		
		while(true){
			
			n = sc.nextInt();
			if(n == 0)break;
			count = 0;
			
			for(int i = 2; i <= n; i++){
				is = true;
				for(int j = 2; j <= Math.sqrt(i); j++)
					if(i % j == 0){
						is = false;
						break;
					}
				
				if(is)list.add(i);
			}
			for(int i = 0; i < list.size(); i++)
				for(int j = i; j < list.size(); j++)
					if(list.get(i) + list.get(j) == n)count++;
			
			System.out.println(count);
			list.clear();
		}
		sc.close();
		}
}