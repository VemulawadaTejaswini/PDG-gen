import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Node W[] = new Node[n];
		int s=Integer.MAX_VALUE; 
		int cost = 0;
		for(int i=0; i<n; i++){
			W[i] = new Node();
			W[i].value = scanner.nextInt();
			W[i].place = -1;
			if(s > W[i].value) s = W[i].value;
		}

		for(int j=0; j<n; j++){
			int min=Integer.MAX_VALUE, place=-1;
			for(int i=0; i<n; i++){
				if(W[i].place != -1) continue;
				if(min > W[i].value){
					min = W[i].value;
					place = i;
				}
			}
			W[place].place = j;
		}

		for(int i=0; i<n; i++){
			int j=W[i].place;
			if(j != -1 && j != i){
				int cnt=1, min, sum;
				min = sum = W[i].value;
				while(j != i){
					int next = W[j].place;
					if(min > W[j].value) min = W[j].value;
					sum += W[j].value;
					cnt++;
					W[j].place = -1;
					j = next;
				}
				cost += sum+(cnt-2)*min<sum+min+(cnt+1)*s?
				        sum+(cnt-2)*min:
				        sum+min+(cnt+1)*s;
			}
		}

		System.out.println(cost);
	}
}
class Node{
	int value;
	int place;
}
