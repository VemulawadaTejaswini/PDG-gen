import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scaner=new Scanner(System.in);
		while(true){
			String a[]=scaner.nextLine().split(" ");
			drawRect(Integer.parseInt(a[0]),Integer.parseInt(a[1]));
			if(!isEnd(Integer.parseInt(a[0]),Integer.parseInt(a[1]))){
				System.out.print('\n');
			}else{
				break;
			}
		}
	}
	
	static void drawRect(int h,int w){
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(isFrame(i,j,h,w)){
					System.out.print("#");
				}else{
					System.out.print(".");
				}
			}
			System.out.print('\n');
		}
	}
	
	static boolean isEnd(int h,int w){
		return h==0&&w==0;
	}
	
	static boolean isFrame(int h,int w,int maxh,int maxw){
		return !(h!=0&&w!=0&&h!=maxh-1&&w!=maxw-1);
	}

}