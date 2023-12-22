import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n==0)break;
			boolean boo = true;
			long pro = 1;
			int count2 = 0;
			int count5 = 0;
			for(int i = 1; i < n+1 ; i++){
				pro = i ;
				while(pro % 5 == 0){
					count5++;
					pro /=5;
				}
				while(pro % 2 == 0){
					count2++;
					pro /=2;
				}
			}
			System.out.println(Math.min(count2,count5));
		}
	}
}