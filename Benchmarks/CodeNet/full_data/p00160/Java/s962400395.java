import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int sum = 0;
			for(int i=0;i<n;i++){
				int s = sc.nextInt() + sc.nextInt() + sc.nextInt();
				int w = sc.nextInt();
				
				if(160<s || 25<w);
				else if((140<s && s<=160) || (20<w && w<=25)) sum+=1600;
				else if((120<s && s<=140) || (15<w && w<=20)) sum+=1400;
				else if((100<s && s<=120) || (10<w && w<=15)) sum+=1200;
				else if((80<s && s<=100) || (5<w && w<=10)) sum+=1000;
				else if((60<s && s<=80) || (2<w && w<=5)) sum+=800;
				else sum+=600;
			}
			System.out.println(sum);
		}	
	}	
}