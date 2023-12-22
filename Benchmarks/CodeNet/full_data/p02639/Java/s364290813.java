import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int s = 1;
		for(int i = 0; i < 5; i++){
			if(sc.nextInt() != 0){
				s++;
			}else{
				i += 5;
			}
		}
		System.out.println(s);
	}
}