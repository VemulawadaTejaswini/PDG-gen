public class Coffee {

	public static void main(String[] args) {
		
		String[] s=new String[6];
		Scanner u=new Scanner(System.in);
		
		for(int i=0;i<6;i++) {
			s[i]=u.next();
		}
		
	
		if(s[2]==s[3]){
			System.out.print("Yes");
		}
		if(s[4]==s[5]) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}

	}

}
