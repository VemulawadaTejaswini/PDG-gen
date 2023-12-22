import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int m = scan.nextInt();
			int a = scan.nextInt();
			if(n == 0 && m == 0 && a == 0){
				break;
			}
			Cross[] cr = new Cross[m];
			int maxHeight = 0;
			for(int i = 0;i < m;i++){
				int h = scan.nextInt();
				cr[i] = new Cross();
				cr[i].setCross(h,scan.nextInt(),scan.nextInt());
				if(h > maxHeight){
					maxHeight = h;
				}
			}
			for(int i = maxHeight;i > 0;i--){
				for(int j = 0;j < n;j++){
					if(cr[j].checkCross(i)){
						if(cr[j].checkPoint1(a)){
							a = cr[j].getPoint2();
						}else if(cr[j].checkPoint2(a)){
							a = cr[j].getPoint1();
						}
					}
				}
			}
			System.out.println(a);
		}
	}
	public class Cross{
		private int height;
		private int point1;
		private int point2;
		public Cross(){	
		}
		public void setCross(int height,int point1,int point2){
			this.height = height;
			this.point1 = point1;
			this.point2 = point2;
		}
		public boolean checkCross(int i){
			return (i == height)?true:false;
		}
		public boolean checkPoint1(int i){
			return (i == point1)?true:false;
		}
		public boolean checkPoint2(int i){
			return (i == point2)?true:false;
		}
		public int getPoint1(){
			return point1;
		}
		public int getPoint2(){
			return point2;
		}
	}
}