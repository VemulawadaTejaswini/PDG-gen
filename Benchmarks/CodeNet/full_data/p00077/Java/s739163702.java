import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			char[] c = sc.nextLine().toCharArray();
			String result = "";
			for(int i = 0; i < c.length; i++){
				if(c[i] == '@'){
					for(int j = 0; j < c[i+1]; j++){
						result += c[i+2];
					}
				}else{
					result += c[i];
				}
			}
			System.out.println(result);
		}
	}
}