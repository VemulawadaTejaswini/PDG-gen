import java.util.*;
class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //行数
		int b = sc.nextInt(); //列数
		int flag = 1;
		String picture[][] = new String[a][b];
		for(int y=0; y<b; y++){
			for(int x=0; x<a; x++){
				picture[x][y] = sc.next();
			}
		}
		if(picture[0][0].equals("#")){
			if(picture[0][1] != "#" && picture[1][0] != "#"){
				flag = flag*0;
			}
		}
		if(picture[a-1][0].equals("#")){
			if(picture[a-1][1] != "#" && picture[a-2][0] != "#"){
				flag = flag*0;
			}
		}
		if(picture[a-1][b-1].equals("#")){
			if(picture[a-2][b-1] != "#" && picture[a-1][b-2] != "#"){
				flag = flag*0;
			}
		}
		if(picture[0][b-1].equals("#")){
			if(picture[0][b-2] != "#" && picture[1][b-1] != "#"){
				flag = flag*0;
			}
		}
		for(int x2=1; x2<a-1; x2++){
			if(picture[x2][0].equals("#")){
					boolean bl2 = picture[x2-1][0] !="#" &&
					picture[x2+1][0]  !="#" &&
					picture[x2][1]  !="#";
					if(bl2 == true){
						flag = flag*0;
					}
				}
		}
		for(int x3=1; x3<a-1; x3++){
			if(picture[x3][b-1].equals("#")){
					boolean bl3 = picture[x3-1][b-1] !="#" &&
					picture[x3+1][b-1]  !="#" &&
					picture[x3][b-2]  !="#";
					if(bl3 == true){
						flag = flag*0;
					}
				}
		}
		for(int y4=1; y4<b-1; y4++){
			if(picture[0][y4].equals("#")){
					boolean bl4 = picture[0][y4-1] !="#" &&
					picture[0][y4+1]  !="#" &&
					picture[1][y4]  !="#";
					if(bl4 == true){
						flag = flag*0;
					}
				}
		}
		for(int y5=1; y5<b-1; y5++){
			if(picture[a-1][y5].equals("#")){
					boolean bl5 = picture[a-1][y5-1] !="#" &&
					picture[a-1][y5+1]  !="#" &&
					picture[a-2][y5]  !="#";
					if(bl5 == true){
						flag = flag*0;
					}
				}
		}
		for(int y1=1; y1<b-1; y1++){
			for(int x1=1; x1<a-1; x1++){
				if(picture[x1][y1].equals("#")){
					boolean bl = picture[x1][y1-1] !="#" &&
					picture[x1-1][y1]  !="#" &&
					picture[x1+1][y1]  !="#" &&
					picture[x1][y1+1] !="#";
					if(bl == true){
						flag = flag*0;
					}
				}
			}
		}
		System.out.println(picture[0][0]);
		if(flag == 0){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
}