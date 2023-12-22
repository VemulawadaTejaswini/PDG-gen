import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == 0 & b == 0) break;
			int count = 0;
			for(int i = a; i <= b; i++){
				if(judge(i)){
					System.out.println(i);
					count++;
				}
			}
			if(count == 0) System.out.println("NA");
			System.out.println();
		}
	}
	static boolean judge(int i){
		if(i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)){
			return true;
		}else{
			return false;
		}
	}
}