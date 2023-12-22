import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
		try {
			String line;
			while(true){
				/* input */
				line = br.readLine();
				int c = Integer.parseInt(line.split("[ \t]")[0]), r = Integer.parseInt(line.split("[ \t]")[1]);
				if(c==0&&r==0){
					return;
				}
				int[] robot = new int[3];
				
				//first and second index indicates the current position
				robot[0] = 1;
				robot[1] = 1;
				//third index shows direction: 0:north, 1:east, 2:south, 3:west
				robot[2] = 0;
				/* commands */
				while(true){
					line = br.readLine();
					if(line.indexOf("STOP") > -1){
						break;
					} else if(line.indexOf("RIGHT") > -1){
						robot[2] = (robot[2] + 1) % 4; 
					} else if(line.indexOf("LEFT") > -1){
						robot[2] = (robot[2] + 3) % 4; 
					} else {
						String com = line.split(" ")[0];
						int n = Integer.parseInt(line.split("[ \t]")[1]);
						if(com.indexOf("FORWARD") > -1){
							switch(robot[2]){
							case 0:
								robot[1] += n;
								if(robot[1] > r) robot[1] = r;
								break;
							case 1:
								robot[0] += n;
								if(robot[0] > c) robot[0] = c;
								break;
							case 2:
								robot[1] -= n;
								if(robot[1] < 0) robot[1] = 0;
								break;
							case 3:
								robot[0] -= n;
								if(robot[0] < 0) robot[0] = 0;
								break;
							}
						}
						if(com.indexOf("BACKWARD") > -1){
							switch(robot[2]){
							case 0:
								robot[1] -= n;
								if(robot[1] < r) robot[1] = r;
								break;
							case 1:
								robot[0] -= n;
								if(robot[0] < c) robot[0] = c;
								break;
							case 2:
								robot[1] += n;
								if(robot[1] > 0) robot[1] = 0;
								break;
							case 3:
								robot[0] += n;
								if(robot[0] > 0) robot[0] = 0;
								break;
							}
						}
					}
				}
				
				
				/* output */
				System.out.println(robot[0] + " " + robot[1]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}