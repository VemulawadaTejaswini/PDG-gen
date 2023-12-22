import java.io.*;
public class Main {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
        	while(true) {
        		String line = reader.readLine();
        		String[] num = line.split(" ", -1);
        		int H = Integer.parseInt(num[0]);
        		int W = Integer.parseInt(num[1]);
        		if (H == 0 && W == 0) {
        			break;
        		} else {
        			for (int i = 0; i < H; i++) {
        				for (int j = 0; j < W; j++) {
        					System.out.print("#");
        				}
        				System.out.println();
        			}
        			System.out.println();
        		}
        	}
        } catch (IOException e) {
          System.out.println(e);
        } catch (NumberFormatException e) {
          System.out.println("error");
        }
    }
}