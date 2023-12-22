import java.util.Scanner;

public class Main{
	static boolean isNumber(String s){
		try{
		int n = Integer.parseInt(s);
		return true;
		}catch(NumberFormatException e){
		return false;
		}
	}

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String[] str = new String[1000];
		int i = 0;
		for(; i < 1000; i++){
			str[i] = stdIn.nextLine();
			if( !isNumber(str[i]) )
				break;
		}
		
		int[] n = new int[i];
		for(int j = 0; j < i; j++){
			n[j] = Integer.parseInt(str[j]);

			int count = 0;
			if( n[j] >= 2 )
				count++;
			if( n[j] >= 3 )
				count++;

			int[] p = new int[999999];
			p[0] = 2;
			p[1] = 3;
			for(int l = 5; l <= n[j]; l += 2){
				for(int k =1; k < count; k++){
					if( l % p[k] == 0 ){
						break;
					}
					else if ( p[k] > Math.sqrt(l) ){
						p[count] = l;
						count++;
						break;
					}
				}
			}
			

			System.out.println(count);
		}
	}
}