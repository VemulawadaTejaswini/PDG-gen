import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = 100000;
		while(scan.hasNext()){
			int x = scan.nextInt();
			int s = n;
			for(int i = 0;i < x;i++){
				s += (int)(n*0.05);
			}
			int t2 = s % 10000;
			if(t2 != 0){
				s = s - t2 +10000;
			}
			System.out.println(s);
		}
	}
}