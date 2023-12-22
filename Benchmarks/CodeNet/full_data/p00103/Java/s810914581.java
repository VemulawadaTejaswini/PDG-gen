import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++){
			int outCount = 0;
			Ground gr = new Ground();
			while(true){
				String event = br.readLine();
				
				if(event.equals("OUT")){
					outCount++;
					if(outCount == 3){
						break;
					}
				}
				else if(event.equals("HIT")){
					gr.Hit();
					//gr.printPoint();
				}
				else if(event.equals("HOMERUN")){
					gr.HomeRun();
					//gr.printPoint();
				}
			}
			
			gr.printPoint();
		}
	}

}

class Ground {
	int[] base;
	int point;
	
	public Ground(){
		base = new int[3];
		Arrays.fill(base, 0);
		point = 0;
	}
	
	public void Hit(){
		if (base[2] == 1){
			point++;
		}
		
		base[2] = base[1];
		base[1] = base[0];
		base[0] = 1;
	}
	
	public void HomeRun(){
		for(int i = 0; i < 3 ; i++){
			point += base[i];
			base[i] = 0;
		}
		point++;
	}
	
	public void printPoint(){
		System.out.println(point);
	}
}