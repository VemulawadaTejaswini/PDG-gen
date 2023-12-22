import java.io.*;
class Main{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String array[] = str.split(" ");
		
		int W = Integer.parseInt(array[0]);
		int H = Integer.parseInt(array[1]);
		int x = Integer.parseInt(array[2]);
		int y = Integer.parseInt(array[3]);
		int r = Integer.parseInt(array[4]);
		
		if(W > x + r && H > y + r){
			System.out.println("Yes");
			}else {
				System.out.println("No");
				}
				}
				}