import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, r, p, c, x;
		List<Integer> cards = new ArrayList<Integer>();
		
		while(true){
			n=sc.nextInt(); //???????????°
			r=sc.nextInt(); //???????????????????????°
			
			if(n==0&&r==0){break;}
			
			for(int i=0;i<n;i++){
				cards.add(i+1);
			}
			
			for(int i=0;i<r;i++){
				p=sc.nextInt(); //p??????????????????
				c=sc.nextInt(); //c??????????????????
				for(int j=0;j<c;j++){
					x=cards.get(n-p-c+1);
					cards.remove(n-p-c+1);
					cards.add(x);
				}
			}
			System.out.println(cards.get(n-1));
			cards.clear();
		}
	}
}