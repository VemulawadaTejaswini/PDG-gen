import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str;
		boolean is;
		int count = 0;
		while(sc.hasNextInt()){
			str = sc.next();
			is = true;
			
			for(int i = 0; i < str.length()/2; i++)
				if(!(String.valueOf(str.charAt(i)).equals
				  (String.valueOf(str.charAt(str.length()-i))))){
					is = false;
					break;
				}
			if(is)count++;
		}
		System.out.println(count);
		
		sc.close();
	}
}