import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str = scan.nextLine().replace("="," ").replace("+"," ");
			boolean sw = true;
			for(int i = 0;i < 10;i++){
				String ns = str.replaceAll("X",i+"");
				String[] a = ns.split(" ");
				if(Integer.parseInt(a[0])+Integer.parseInt(a[1])==Integer.parseInt(a[2])){
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