import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String s  = sc.next();
		String p  = sc.next();
		
		sc.close();
		
		boolean answer = computeRingPattern(s,p);
		
		if(answer){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		
	}

	private static boolean computeRingPattern(String s, String p) {
		
		char[] strings = new char[s.length()+p.length()];
		
		for(int i= 0; i< s.length() +p.length();i++){
			
			if(i < s.length()){
				
				strings[i] = s.charAt(i);
			}else{
				
				strings[i] = s.charAt(i -s.length());
				
			}
			
		}
		
		for(int i = 0; i<strings.length -p.length() +1 ;i++){
			
			for(int j =0; j<p.length();j++){
				
				
				if(strings[i+j] != p.charAt(j)){
					
					break;
				}
				
				if((j + 1) == p.length()){
					return true;
				}
				
			}
			
			
		}
		
		
		return false;
	}

}

