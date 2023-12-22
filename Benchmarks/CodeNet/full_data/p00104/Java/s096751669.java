import java.io.*;
class Main{
	static char[][] direction;
	static boolean[][] flag;
	static int posiX,posiY;
	public static void main(String[] args){
		String[] s;
		int width,height;
		try{
			BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
			while(true){
				s=b.readLine().split(" ");
				width=Integer.parseInt(s[0]);
				height=Integer.parseInt(s[1]);
				if(width==0&&height==0)break;
				direction=new char[height][width];
				flag=new boolean[height][width];
				for(int i=0;i<height;i++){
					s[0]=b.readLine();
					for(int j=0;j<width;j++){
						direction[i][j]=s[0].charAt(j);
						flag[i][j]=false;
					}
				}
				posiX=0;posiY=0;
				while(true){
					if(direction[posiY][posiX]=='.'){
						System.out.println(posiX+" "+posiY);
						break;
					}else if(flag[posiY][posiX]=true){
						System.out.println("LOOP");
						break;
					}
					flag[posiY][posiX]=true;
					switch(direction[posiY][posiX]){
					case '^':posiY--;break;
					case 'v':posiY++;break;
					case '>':posiX++;break;
					case '<':posiX--;break;
					}
				}
			}
		}catch(IOException e){}
	}
}