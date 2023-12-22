
import java.util.Scanner;
class Main {
	Scanner scan = new Scanner(System.in);
	
	public static void main(String args[]){
		Main app = new Main();
		int n = app.scan.nextInt();
		for(int i=0;i<n;i++){
			System.out.println(app.baseball());
		}
	}
	
	public int baseball(){
		int point = 0;
		int[] runner = new int[3];
		int out = 0;
		
		while(true){
			String str = scan.next();
			if(str.equals("HIT")){
				if(runner[2]==1)
					point++;
				runner[2] = runner[1];
				runner[1] = runner[0];
				runner[0] = 1;
			}else if(str.equals("OUT")){
				out++;
			}else if(str.equals("HOMERUN")){
				point++;
				for(int i=0;i<3;i++){
					if(runner[i]==1)
						point++;
					runner[i] = 0;
				}
			}
			if(out==3)
				break;
		}
		
		return point;
	}
}