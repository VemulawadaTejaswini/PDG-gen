import java.util.*;

public class Main {
	int [] dx = {0,1,0,-1};
	int [] dy = {1,0,-1,0};
	
	private void doit(){
		
		Scanner sc = new Scanner(System.in);
		long mod = 1000000007;
		while(sc.hasNext()){
			StringBuilder s = new StringBuilder(sc.next());
			
			while(true){
				if(s.length() == 0){
					System.out.println("YES");
					break;
				}
				if(s.toString().startsWith("dream")){
					if(s.toString().startsWith("dreamer")){
						if(s.toString().startsWith("dreamera")){
							s.delete(0,5);
						}
						else{
							s.delete(0, 7);
						}
					}
					else{
						s.delete(0,5);
					}
				}
				else if(s.toString().startsWith("erase")){
					if(s.toString().startsWith("eraser")){
						s.delete(0, 6);
					}
					else{
						s.delete(0, 5);
					}
				}
				else{
					System.out.println("NO");
					break;
				}
			}
			
		}

	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
