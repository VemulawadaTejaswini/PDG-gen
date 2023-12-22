import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0)break;

			int in = 0;
			int sumA = 0;
			int sumB = 0;
			boolean flag = true;
			
			LinkedList<Integer> list = new LinkedList<Integer>();
			
			while(true){
				
				for(int i=1;i<=n;i++){
					in = sc.nextInt();
					list.push(in);
					if(in!=i)flag = false;
					sumA += in;
				}
				if(flag==true){
					System.out.println("0");
					break;
				}
				
				for(int i=1;;i++){
					sumB += i;
					if(sumB==sumA){
						break;
					}else if(sumB>sumA){
						flag = true;
						break;
					}
				}
				if(flag==true){
					System.out.println("-1");
					break;
				}
	
				int s = 0;
				int t = 0;
				int count = 0;
				while(true){
					sumA = 0;
					flag = false;
					s = list.size();
					for(int i=0;i<s;i++){
						t = list.pollLast()-1;
						if(t!=0){
							list.push(t);
							sumA++;
							if(t!=sumA)flag=true;
						}
					}
					if(list.size()==0)flag=true;
					list.push(s);
					count++;
					if(count>=10000){
						System.out.println("-1");
						break;
					}
					if(flag==false){
						System.out.println(count);
						break;
					}
				}

				break;
			}
		}
	}	
}