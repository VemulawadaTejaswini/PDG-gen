import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		String ss = s.nextLine();
		String st = s.nextLine();
		
		int count=0;
		
		char[] sstri= ss.toCharArray();
		char[] tstri= st.toCharArray();
		
		for(int i=0;i<sstri.length;i++){
			if(sstri[i] != tstri[i]){
				count++;
			}
		}
		System.out.print(count);
	}
}