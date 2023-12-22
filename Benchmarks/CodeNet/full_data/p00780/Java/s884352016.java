import java.util.*;
public class Main{
	public static List<Integer> p=Prime(32768);
	public static int s=p.size();
	public static List<Integer> Prime(int n) {
		List<Integer> primes=new ArrayList<Integer>();
		primes.add(2);
		for(int i=3;i<= n;i++){
			int tmp=(int)(Math.sqrt(i))+1;
			for(int j=2;j<=tmp;j++){
				if(i % j == 0){
					break;
				}
				if(j == tmp){
					primes.add(i);
				}
			}
		}
		return primes;
	}
	public static int check(int n){
		int count=0;
		for(int i=0;i<s;i++){
			for(int j=s-1;j>=i;j--){
				if((p.get(i)+p.get(j))==n){
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num;
		while(true){
			num=sc.nextInt();
			if(num!=0){
				System.out.println(check(num));
			}
			else{
				break;
			}
		}
	}
}
