import java.util.*;
import java.awt.geom.*;
public class Main {
	
	private void doit(){
		Scanner sc =new Scanner(System.in);
		boolean isfirst = true;
		while(true){
			int start = sc.nextInt();
			int end = sc.nextInt();
			if((start|end)== 0) break;
			
			if(! isfirst){
				System.out.println();
			}
			isfirst = false;
			boolean flg = false;
			for(int i = start; i <= end; i++){
				if(isleapYear(i)){
					System.out.println(i);
					flg = true;
				}
			}
			if(! flg){
				System.out.println("NA");
			}
		}
	}

	private boolean isleapYear(int i) {
		if(i % 4 != 0){
			return false;
		}
		else if(i % 400 == 0){
			return true;
		}
		else if(i % 100 == 0){
			return false;
		}
		else{
			return true;
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}