import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String result = "";
		for(int i=0; i<a.length()+b.length(); i++){
			if(i%2==0){
				result += a.charAt(i/2);
			}else{
				result += b.charAt((i-1)/2);
			}
		}
		System.out.println(result);
	}
}
