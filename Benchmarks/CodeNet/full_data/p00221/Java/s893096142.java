import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String a = scan.nextLine();
			if(a.equals("0 0")){
				break;
			}
			int m = Integer.parseInt(a.charAt(0)+"");
			int n = Integer.parseInt(a.charAt(2)+"");
			boolean[] p = new boolean[m];
			int tp = 0;
			int count = m;
			String[] str = new String[n];
			for(int i = 0;i < n;i++){
				str[i] = scan.nextLine();
			}
			for(int i = 1;i <= n;i++){
				if(count == 1){
					break;
				}
				while(p[tp]){
					tp = (tp+1)%m;
				}
				if(i%15 == 0){
					if(!str[i-1].equals("FizzBuzz")){
						p[tp] = true;
						count--;
					}
				}else if(i%5 == 0){
					if(!str[i-1].equals("Buzz")){
						p[tp] = true;
						count--;
					}
				}else if(i%3 == 0){
					if(!str[i-1].equals("Fizz")){
						p[tp] = true;
						count--;
					}
				}else{
					if(!str[i-1].equals(String.valueOf(i))){
						p[tp] = true;
						count--;
					}
				}
				tp++;
				if(tp >= m){
					tp %= m;
				}
			}
			String ans = "";
			for(int i = 0;i < m;i++){
				if(!p[i]){
					ans += (ans.equals(""))?(i+1):(" "+(i+1));
				}
			}
			System.out.println(ans);
		}
	}
}