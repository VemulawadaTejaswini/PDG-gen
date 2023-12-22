import java.util.Scanner;

public class Main {
	static final int hashA = 97;
	static final int hashEnd = hashA + 26;
	static final int hashPeriod = 46;
	void run(){
		Scanner s = new Scanner(System.in);
		String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
		int[] cntAlpha = new int[alphabet.length];
		String txt="";
		do{
			txt += s.next("");
		}while(s.hasNext());
		txt = txt.toLowerCase();
		for (int i = 0;i < txt.length();i++){
			char ch = txt.charAt(i);
			int hash = String.valueOf(ch).hashCode();
			if(hash >= hashA && hash <= hashEnd){
				cntAlpha[hash - hashA]++;
			}
		}
		for(int i = 0;i < alphabet.length;i++){
			System.out.println(alphabet[i] + " : " + cntAlpha[i]);
		}
		s.close();
	}
	public static void main(String args[]){
		new Main().run();
	}
}