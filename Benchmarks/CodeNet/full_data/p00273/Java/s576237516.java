import java.util.*;
public class Main{
	public void output(){
		Scanner scan = new Scanner(System.in);
		for(int i = 1;i <= 4;i++){
			int t = scan.nextInt();
			int n = scan.nextInt();
			if(t == 1){
				t = 6000;
			}else if(t == 2){
				t = 4000;
			}else if(t ==3){
				t = 3000;
			}else t = 2000;
			System.out.println(t * n);
		}
	}
}