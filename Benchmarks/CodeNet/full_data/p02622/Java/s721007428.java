import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sS = new Scanner(System.in);
		Scanner sT = new Scanner(System.in);
		
		String S = sS.nextLine();
		String T = sT.nextLine();
		
		int count=0;
		
		char[] sstri= S.toCharArray();
		char[] tstri= T.toCharArray();
		
		for(int i=0;i<=sstri.length;i++){
			if(i==sstri.length){
				System.out.print(count);
			}
			else if(sstri[i] != tstri[i]){
				sstri[i] = tstri[i];
				count++;
			}
		}
	}
}