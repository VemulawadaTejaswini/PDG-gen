import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
//		System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		int finded = 0;
		int lineSamount = scan.nextInt();
		int[] lineSnum = new int[lineSamount];
		for(int i=0; i<lineSamount; i++){
			lineSnum[i] = scan.nextInt();
		}
		int lineTamount = scan.nextInt();
		int[] lineTnum = new int[lineTamount];
		for(int i=0; i<lineTamount; i++){
			lineTnum[i] = scan.nextInt();
		}
		int endNum = lineTnum[lineTamount-1];
		
		for(int i=0; i<lineSamount; i++){
			int j = 0;
			
			while(lineTnum[j] != endNum){
				if(lineTnum[j]==lineSnum[i]){
					finded++;
					break;
				}
				j++;
			}
			if(endNum ==lineSnum[i]){
				finded ++;
			}
		}
		System.out.println(finded);
	}
}