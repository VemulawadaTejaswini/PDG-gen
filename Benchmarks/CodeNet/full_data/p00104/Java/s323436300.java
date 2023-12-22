import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			int h=sc.nextInt();
			int w=sc.nextInt();
			if(h==0&&w==0){
				break;
			}
			char[][] map=new char[h][w];
			boolean[][] mapFlag=new boolean[h][w];
			for(int i=0;i<h;i++){
				map[i]=sc.next().toCharArray();
			}
			int x=0;
			int y=0;
			boolean flag=true;
			while(map[y][x]!='.'){
				if(mapFlag[y][x]){
					flag=false;
					break;
				}
				mapFlag[y][x]=true;
				if(map[y][x]=='>'){
					x++;
				}else if(map[y][x]=='v'){
					y++;
				}else if(map[y][x]=='<'){
					x--;
				}else if(map[y][x]=='^'){
					y--;
				}
			}
			if(flag){
				System.out.println(x+" "+y);
			}else{
				System.out.println("LOOP");
			}
		}
	}
}