import java.io.*;
class main1{
	public static void main(String[] args)throws IOException{
		int w = 0;
		int x;
		int y;
		int z = 0;
		System.out.print("input bottom and height");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
            String str = br.readLine();
            String array[] = str.split(" ");
            
            x = Integer.parseInt(array[0]);
			y = Integer.parseInt(array[1]);
			
			w = x * y;
			z = 2*x + 2*y;
				System.out.println(w + " " +z);
				}
				}