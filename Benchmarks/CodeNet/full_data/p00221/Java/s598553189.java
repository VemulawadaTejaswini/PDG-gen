import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int m = sc.nextInt();
			int n = sc.nextInt();
			if(m==0 && n==0) break;
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=1;i<=m;i++) list.add(i);
			
			String s;
			int k = 0;
			for(int i=1;i<=n;i++){
				s = sc.next();
				if(list.size()>1){
					if(i%15==0){
						if(s.compareTo("FizzBuzz")==0) k++;
						else list.remove(k);
					}else if(i%5==0){
						if(s.compareTo("Buzz")==0) k++;
						else list.remove(k);
					}else if(i%3==0){
						if(s.compareTo("Fizz")==0) k++;
						else list.remove(k);
					}else{
						if(s.compareTo(Integer.toString(i))==0) k++;
						else list.remove(k);
					}
					if(k==list.size()) k=0;
				}
			}
			for(int i=0;i<list.size();i++){
				if(i!=0) System.out.print(" ");
				System.out.print(list.get(i));
			}
			System.out.println();
		}	
	}	
}