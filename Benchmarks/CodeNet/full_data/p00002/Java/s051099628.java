import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = 0,b = 0;
		while(scan.hasNext()){
			a = scan.nextInt();
			b = scan.nextInt();
			int sum = a + b;
			int i = 1,count=0;
			while(true){
				if(sum < i){
					System.out.println(count);
					break;
				}
				i *= 10;
				count++;
			}
			if(scan.hasNext() == false){
				break;
			}
		}
	}
}