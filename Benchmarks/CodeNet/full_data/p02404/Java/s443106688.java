import java.util.Scanner;

class Main{
	public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
		int h,w,i,j;
		for(;;){
			h=stdIn.nextInt();
			w=stdIn.nextInt();
			if(h<1&&w<1)break;
			for(i=0;i<h;i++){
				for(j=0;j<w;j++){
					if(i!=0&&i!=h-1&&j!=0&&j!=w-1)System.out.print(".");
					else System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
