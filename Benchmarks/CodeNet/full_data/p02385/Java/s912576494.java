import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Dice d1=new Dice(br.readLine().split(" "));
		Dice d2=new Dice(br.readLine().split(" "));
		boolean match=false;
		int i=0;
		while(!d1.match(d2)&&i<6){
			int j=0;
			while(!d1.match(d2)&&j<4) d2.spinR();
			if(match) break;
			if(i%2==0){
				d2.throwN();
			}else{
				d2.throwW();
			}
		}
		if(match){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	
	static class Dice {
		private String top,front,right,left,back,bottom;

		public Dice(String[] lbl){
			top=lbl[0];
			front=lbl[1];
			right=lbl[2];
			left=lbl[3];
			back=lbl[4];
			bottom=lbl[5];
		}
		
		public void throwN(){ String tmp=top; top=front; front=bottom; bottom=back; back=tmp; }
		public void throwS(){ String tmp=top; top=back; back=bottom; bottom=front; front=tmp; }
		public void throwE(){ String tmp=top; top=left; left=bottom; bottom=right; right=tmp; }
		public void throwW(){ String tmp=top; top=right; right=bottom; bottom=left; left=tmp; }
		public void spinR(){ String tmp=front; front=left; left=back; back=right; right=tmp; }

		public String getTop() { return top; }
		public String getFront() { return front; }
		public String getRight() { return right; }
		public String getLeft() { return left; }
		public String getBack() { return back; }
		public String getBottom() { return bottom; }
		
		public boolean match(Dice dice2){
			if(this.getTop().equals(dice2.getTop())&&this.getFront().equals(dice2.getFront())
					&&this.getRight().equals(dice2.getRight())&&this.getLeft().equals(dice2.getLeft())
					&&this.getBack().equals(dice2.getBack())&&this.getBottom().equals(dice2.getBottom())){
				return true;
			}else{
				return false;
			}
		}
	}
}