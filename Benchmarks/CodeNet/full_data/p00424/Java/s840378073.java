import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan =  null;
		try{
			scan = new Scanner(System.in);
			int n;
			while((n = scan.nextInt())!=0){
			char[][] set = new char[n][2];
			for(int i = 0; i < set.length;i++){
				for(int j = 0 ;j < set[i].length;j++){
					set[i][j] = scan.next().charAt(0);
				}
			}
			int m = scan.nextInt();
			for(int i = 0 ; i < m;i++){
				char c = scan.next().charAt(0);
				boolean check = false;
				for(int j = 0; j < set.length;j++){
					if(set[j][0] == c){
						check = true;
						System.out.print(set[j][1]);
						break;
					}
				}
				if(!check)System.out.print(c);
			}
			System.out.println();
			}
		}finally{
			if(scan !=null)scan.close();
		}
	}
}