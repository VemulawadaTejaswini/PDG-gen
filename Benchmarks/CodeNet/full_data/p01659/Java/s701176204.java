import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			if(q.isEmpty() || q.peek()<a){
				q.push(a);
				cnt++;	
			}else{
				while(true){
					int b = q.peek();
					if(b>a) q.pop();
					else if(b==a) break;
					else if(b<a){
						q.push(a);
						cnt++;
						break;
					}
					if(q.isEmpty()){
						q.push(a);
						cnt++;
						break;
					}
				}
			}
		}
		
		System.out.println(cnt);
	}	
}