import java.util.*;



class Main {
	Scanner sc = new Scanner(System.in);


	String[] block;
	public void run() {
		while(sc.hasNext()){
			block=new String[8];
			for(int i=0;i<8;i++){
				block[i]=sc.next();
			}
			Loop:for(int i=0;i<8;i++)
				for(int j=0;j<8;j++){
					if(block[i].charAt(j)=='1'){
						if(j+1<8 && block[i].charAt(j+1)=='1'){
							if(j+2<8 && block[i].charAt(j+2)=='1'){
								ln("C");
							}else{
								if(j>=1 && block[i+1].charAt(j-1)=='1'){
									ln("G");
								}else{
									if(i+1<8 &&j+1<8 && block[i].charAt(j+1)=='1' && block[i+1].charAt(j)=='1'){
										ln("A");
									}else{
										ln("E");
									}
								}
							}
						}else{
							if(i+2<8 &&block[i+2].charAt(j)=='1'){
								ln("B");
							}else{
								if(i+1<8 && j+1<8 && block[i+1].charAt(j+1)=='1'){
									ln("F");
								}else{
									ln("D");
								}
							}
						}
						break Loop;
					}
				}
		}
	}

	public boolean isA(){

		return false;
	}




	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}

class P{
	double x;
	double y;
	P(double _x,double _y){
		x=_x;
		y=_y;
	}

	public static double dot(P a,P b){
			return a.x*b.x+a.y*b.y;
	}
	public static  double cross(P a,P b){
		return a.x*b.y-a.y*b.x;
	}
	public P a(P a){
		return new P(x+a.x,y+a.y);
	}
	public P s(P a){
		return new P(x-a.x,y-a.y);
	}

	public double norm(){
		return Math.sqrt(x*x+y*y);
	}

	public static int ccw(P a,P b,P c){
		if(P.cross(b.s(a),c.s(a))>Double.MIN_NORMAL){
			return 1;
		}
		if(P.cross(b.s(a),c.s(a))<-Double.MIN_NORMAL){
			return -1;
		}
		if(P.dot(b,c)<-Double.MIN_NORMAL)return 2;
		if(b.norm()<c.norm()-Double.MIN_NORMAL)return -2;
		return 0;
	}
}