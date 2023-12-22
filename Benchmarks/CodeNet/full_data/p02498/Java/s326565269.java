import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int alfa = 32;
		String line, ans; char[] lineC;
		
		while(true){
			ans = "";
			line = in.nextLine();
			lineC = line.toCharArray();
			
			//for(int i=0;i<lineC.length;i++) System.out.println(lineC[i]+":"+(int)lineC[i]);
			
			for(int i=0;i<lineC.length;i++){
				if(Character.isUpperCase(lineC[i])){ 
					ans += (char)(lineC[i] + alfa);
					//System.out.println("UPPER["+lineC[i]+"] to "+(char)(lineC[i] + alfa));
				}
				else if(Character.isLowerCase(lineC[i])){
					ans += (char)(lineC[i] - alfa);
					//System.out.println("LOWER["+lineC[i]+"] to "+(char)(lineC[i] - alfa));
					
				}
				else ans += lineC[i];
			}
			
			System.out.println(ans);
		}
	}

}