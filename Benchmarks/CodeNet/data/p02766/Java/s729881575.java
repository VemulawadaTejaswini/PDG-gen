import java.util.*;

class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		List<Integer>list=new ArrayList<Integer>();
		int sum=0;
		do{
			list.add(n%k);
			n/=k;
		}while(n>0);
		System.out.println(list.size());
	}
}