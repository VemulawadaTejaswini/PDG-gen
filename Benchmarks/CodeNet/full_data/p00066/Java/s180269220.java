import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	public void run(){
        Scanner scan = new Scanner(System.in);
        int[][] dx = {{0,1,2},{0,3,6},{0,4,8},{1,4,7},{3,4,5},{6,7,8},{2,4,6},{2,5,8}};
        int fl = 0;
        int t = 0;
        while(scan.hasNext()){
            String str = scan.nextLine();
            fl = 0;
            for(int i = 0;i < 8;i++){
                t = 0;
                for(int j = 0;j < 3;j++){
                	switch(str.charAt(dx[i][j])){
                		case 'o': t += 1; break;
                		case 'x': t += 9; break;
                		default: break;
                	}
                }
                if(t == 3){
                    fl = 1;
                    break;
                }else if(t == 27){
                    fl = 2;
                    break;
                }
            }
            System.out.println((fl == 0)?"d":(fl == 1)?"o":"x");
        }
    }
}