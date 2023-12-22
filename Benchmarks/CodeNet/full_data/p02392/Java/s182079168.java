import java.io.*;
class Main{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String array[] = str.split(" ");
		
		int x = Integer.parseInt(array[0]);
		int y = Integer.parseInt(array[1]);
		int z = Integer.parseInt(array[2]);
		
		if( x < y && y < z){
			System.out.println("Yes");
			}else{
			System.out.println("No");
			}
			}
			}