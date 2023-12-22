import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int g = 0;
			int sum = 0;
			int ans = 0;
			boolean checkC = true;
			LinkedList<Integer> list = new LinkedList<Integer>();
			for(int i=1;i<=n;i++){
				list.push(sc.nextInt());
				if(list.get(0)!=i)checkC = false;
				sum += list.get(0);
			}
			
			boolean flag = true;
			
			if(checkC==false){
				for(int i=1;;i++){
					g += i;
					if(sum==g)break;
					if(g>1000000){
						flag = false;
						break;
					}
				}
			}
			
			if(flag==true && checkC==false){
				int countA = 0;
				int countB = 0;
				int s = 0;
				int temp = 0;
				boolean check = true;
				
				while(countA<=10000){
					s = list.size();
					check = true;
					countB = 0;
					for(int i=1;i<=s;i++){
					
						temp = list.pollLast()-1;
						if(temp!=0){
							list.push(temp);
							countB++;
							if(temp!=countB){
								check=false;
							}
						}
					}
					list.push(s);
					countA++;
					if(countB==0)check=false;
					if(check==true){
						ans = countA;
						break;
					}
				}
				if(countA>10000){
					flag = false;
				}
			}
			
			if(flag==true){
				System.out.println(ans);
			}else{
				System.out.println("-1");
			}
		}
	}	
}