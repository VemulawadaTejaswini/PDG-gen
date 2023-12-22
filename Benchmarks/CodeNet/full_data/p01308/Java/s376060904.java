import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static final String[] octave = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
	public static String[] step;
	
	public static int n;
	public static final String START = "start";
	public static final String GOAL = "goal";
	public static void main(String[] args) {
		doIt();

	}
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		int numOfData = sc.nextInt();
		
		for(int i = 0; i < numOfData; i++){
			n = sc.nextInt();
			int m = sc.nextInt();
			//String[] step = new String[n];
			step = new String[n];

			for(int j = 0; j < n; j++){
				step[j] = sc.next();
			}
			//String[] song = new String[m];
			String[] song = new String[m];
			
			for(int j = 0; j < m; j++){
				song[j] = sc.next();
			}
			boolean bMake = false;
			int point;
			int sp = m - 1;
			for(point = n - 1; n - 2 <= point; point--){
				if(ring(point, 1).equals(song[sp])){
					point += 1;
					bMake = true;
					break;
				}
				else if(ring(point, -1).equals(song[sp])){
					point -= 1;
					bMake = true;
					break;
				}
				else if(ring(point, -2).equals(song[sp])){
					point -= 2;
					bMake = true;
					break;
				}
			}
			if(bMake == true){
				for(sp = m - 2; sp > - 1; sp--){
					if(ring(point, 1).equals(song[sp])){
						point += 1;
					}
					else if(ring(point, -1).equals(song[sp])){
						point -= 1;
					}
					else if(ring(point, -2).equals(song[sp])){
						point -= 2;
					}
					else{
						break;
					}
				}
			}
			//System.out.println("point = " + point + ", sp = " + sp);
			if(point == -1){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
	}

	public static String ring(int now, int num){
		//System.out.println("ring : now = " + now + ", num = " + num);
		int i = now + num;
		if(i < -1){
			return START;
		}
		else if(i >= n){
			return GOAL;
		}
		String ret = step[now];
		if(num == -2){
			for(int j = 0; j < 12; j++){
				if(ret.equals(octave[j])){
					j++;
					ret = octave[j % 12];
					break;
				}
			}
		}
		else if(num == 1){
			for(int j = 0; j < 12; j++){
				if(ret.equals(octave[j])){
					j--;
					if(j == -1){
						j = 11;
					}
					ret = octave[j];
					break;
				}
			}
		}
		//System.out.println("ring : now = " + now + ", num = " + num + ", ret = " + ret);
		return ret;
	}
}