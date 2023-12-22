import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
	static int vectors[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
	public static void main(String args[]){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true){
				//String str = br.readLine();
				String strs[] = br.readLine().split("[ \t]");
				int max_x = Integer.parseInt(strs[0]);
				int max_y = Integer.parseInt(strs[1]);

				if(max_x == 0) return;
				int direction = 0;
				int x = 0;
				int y = 0;

				while(true){
					//System.out.println(direction + " " + x + " " + y);
					strs = br.readLine().split("[ \t]");
					if(strs[0].equals("FORWARD")){
						int n = Integer.parseInt(strs[1]);
						int vector[] = vectors[direction];
						x += vector[0] * n;
						if(x < 0) x = 0;
						if(x > max_x) x = max_x;
						y += vector[1] * n;
						if(y < 0) y = 0;
						if(y > max_y) y = max_y;

					}else if(strs[0].equals("BACKWARD")){
						int n = Integer.parseInt(strs[1]);
						int vector[] = new int[2];
						vector[0] = 0 - vectors[direction][0];
						vector[1] = 0 - vectors[direction][1];
						x += vector[0] * n;
						if(x < 0) x = 0;
						if(x > max_x) x = max_x;
						y += vector[1] * n;
						if(y < 0) y = 0;
						if(y > max_y) y = max_y;

					}else if(strs[0].equals("RIGHT")){
						direction++;
						direction = direction % 4;

					}else if(strs[0].equals("LEFT")){
						direction--;
						if(direction < 0) direction += 4;;

					}else if(strs[0].equals("STOP")){
						break;
					}

					//System.out.println(x + " " + y);
				}
				System.out.println(x + " " + y);
			}
		}catch(Exception e){
			System.err.print(e);
		}
	}
}