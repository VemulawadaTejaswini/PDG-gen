
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		for(;;){
			String s = sc.next()+"_EOT";
			
			if(s.equals("."+"_EOT")){
				break;
			}
			
			String s2 = sc.next()+"_EOT";
			
			String[] spl1 = s.split("\"");
			String[] spl2 = s2.split("\"");
			
			boolean match = true;
			boolean close = true;
			int count = 0;
			if(spl1.length != spl2.length){
				match = false;
				close = false;
			}else{
				for(int i = 0; i < spl1.length;i++){
					if(!spl1[i].equals(spl2[i])){
						match = false;
						count ++;
					}
					if(i % 2 == 0){
						if(!spl1[i].equals(spl2[i])){
							close = false;
						}						
					}
				}		
			}
			
			if(match){
				System.out.println("IDENTICAL");
			}else if(close && count == 1){
				System.out.println("CLOSE");
			}else{
				System.out.println("DIFFERENT");
			}
			
		}
		
	}
}

