import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str = scan.nextLine().replace("="," ").replace("+"," ");
			boolean sw = true;
			for(int i = 0;i < 10;i++){
				String[] a = str.replaceAll("X",i+"").split(" ");
				if(Double.parseDouble(a[2])-Double.parseDouble(a[1])==Double.parseDouble(a[0])){
					sw = false;
					System.out.println(i);
					break;
				}
			}
			if(sw){
				System.out.println("NA");
			}
		}
	}
}