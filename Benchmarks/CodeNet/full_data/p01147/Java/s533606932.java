import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		String smax;
		int p, k, o;
		
		while(true){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			String str = sc.next();
			for(int i = 1, l = str.length(); i < n; i++, l = str.length()){
				String s = sc.next();
				p = 0;
				smax = "";
				for(int j = 0, m = s.length(); j < l; j++){
					if(str.substring(j, j+1).equals(s.substring(0, 1))){
						for(k = 1, o = l-j; k < m && k < o; k++){
							if(!(str.substring((j+k),(j+k+1)).equals(s.substring(k, k+1)))){
								break;
							}
						}
						if(p < k){
							p = k;
							smax = str.substring(j, j+k);
						}
					}
				}
				
				str = str.replace(smax, s);
			}
			
			System.out.println(str);
		}
	}
	
	public static void main(String[] args){
		Main test = new Main();
	}
}