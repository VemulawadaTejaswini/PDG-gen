import java.util.Scanner;

public class Main{
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int a[] = new int[4];
		int b[] = new int[4];
		while(scan.hasNext()){
			for(int i = 0;i < 4;i++){
				a[i] = Integer.parseInt(scan.next()); 
			}
			for(int i = 0;i < 4;i++){
				b[i] = Integer.parseInt(scan.next());
			}
			int hit = 0,blow = 0;
			for(int i = 0;i < 4;i++){
				for(int j = 0;j < 4;j++){
					if(a[i] == b[j]){
						if(i == j){
							hit++;
						}else{
							blow++;
						}
					}
				}
			}
			System.out.println(hit + " " + blow);
		}
		System.exit(0);
	}

}