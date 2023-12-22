import java.util.Scanner;

public class Main{
	public static void main(String[] args)throws Exception{
		Scanner in = new Scanner(System.in);
		
		int[] ary = new int[26];
		String s = in.next();
		
		while(true){
			for(int i=0; i<s.length(); i++){
				char c = s.charAt(i);
				if(Character.isUpperCase(c)){
					ary[(int)c-65]++;
				}else{
					ary[(int)c-97]++; 
				}
			}
			
			if(in.hasNext()){
				s = in.next();
			}else{
				break;
			}
		}
		
		System.out.println("inoue");
		for(int i=0; i<ary.length; i++){
			System.out.println((char)(97+i) +" : "+ ary[i]);
		}
		in.close();
	}
}