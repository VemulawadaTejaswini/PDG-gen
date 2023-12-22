public class Main{

	public static void main(String[] args) {
		int n,x,c;
		while(true){
		c = 0;	
		java.util.Scanner scn = new java.util.Scanner(System.in);
		String inl = scn.nextLine();
		String[] part = inl.split(" ");
		n = Integer.parseInt(part[0]);
		x = Integer.parseInt(part[1]);
		if(n == 0 && x == 0) break;
			else{
				for(int i = 1 ; i <= n ; i++){
					for(int j = 1; j <= n ; j++){
						for(int k = 1 ; k <= n ; k++){
							if(i + j + k == x) {
								c++;
							}
						}
					}
				}
				System.out.println(c);
			}
		}
	}
}