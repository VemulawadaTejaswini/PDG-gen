import java.util.Scanner;

public class Main 
{
	static class Tile
	{
		String arrow;
		String pass;
		public Tile()
		{
			pass = "";
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		
		for(; ;)
		{
			int h = scanner.nextInt();
			int w = scanner.nextInt();
			if(w==0 && h==0)
			{
				break;
			}
			
			Tile[][] tile = new Tile[h][w];
			for(int i=0; i<h; i++)
			{
				String input = scanner.next();
				for(int j=0; j<w; j++)
				{
					tile[i][j] = new Tile();
					tile[i][j].arrow = input.substring(j, j+1);
				}
			}
			
			int x = 0;
			int y = 0;
			for(; ;)
			{
				String output = "";
				if(tile[y][x].pass.equals(""))
				{
					tile[y][x].pass = tile[y][x].arrow;
					switch(tile[y][x].arrow)
					{
						case ">":
							x ++;
							break;
						case "<":
							x --;
							break;
						case "^":
							y --;
							break;
						case "v":
							y ++;
							break;
						case ".":
							output = x+" "+y;
							break;
					}
				}
				else
				{
					output = "LOOP";
				}
				
				if(!output.equals(""))
				{
					System.out.println(output);
					break;
				}
			}
		}
	}
}