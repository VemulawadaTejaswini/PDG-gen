import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			int N=cin.nextInt();
			if(N==0)break;
			Dic d=new Dic(
					new Integer(1),
					new Integer(6),
					new Integer(2),
					new Integer(5),
					new Integer(3),
					new Integer(4)
			);
			int ans=1;
			for(;N--!=0;){
				String s = cin.next();
				if(s.equals("North")){
					d.rollX(false);
				}
				else if(s.equals("East")){
					d.rollY(false);
				} 
				else if(s.equals("West")){
					d.rollY(true);
				} 
				else if(s.equals("South")){
					d.rollX(true);
				} 
				else if(s.equals("Right")){
					d.rollZ(true);
				} 
				else if(s.equals("Left")){
					d.rollZ(false);
				}
				ans+= d.id[0];
			}
			System.out.println(ans);
		}
	}


	//さいころのデータクラス
	//equalsは向きも含めて同値であり,isEquivalentは回転することで同じ賽であることを調べる
	//Verify: AOJ0502, AOJ1057
	static class Dic {
		public Integer[] id;
		enum Face{TOP, BOTTOM, FRONT, BACK, RIGHT, LEFT};

		public Integer get(Face f){
			return id[f.ordinal()];
		}

		public Dic copy(){
			return new Dic(id[0], id[1], id[2], id[3], id[4], id[5]);
		}

		public Dic() {
			@SuppressWarnings("unchecked")
			Integer[] tid = (Integer[])new Object[6];
			id = tid;
		}

		public Dic(Integer top, Integer bottom, Integer front, Integer back, Integer right, Integer left) {
			@SuppressWarnings("unchecked")
			Integer[] tid = new Integer[6];
			id = tid;
			id[Face.TOP.ordinal()] = top;
			id[Face.BOTTOM.ordinal()]= bottom;
			id[Face.FRONT.ordinal()] = front;
			id[Face.BACK.ordinal()] = back;
			id[Face.RIGHT.ordinal()] = right;
			id[Face.LEFT.ordinal()] = left;
		}

		//true: X軸方向に手前に転がす
		//false: X軸方向に奥に転がす
		void rollX(boolean isReverse) {
			if(!isReverse) roll(Face.TOP, Face.FRONT, Face.BOTTOM, Face.BACK);
			else roll(Face.TOP, Face.BACK, Face.BOTTOM, Face.FRONT);
		}

		//true: Y軸方向に左へ転がす
		//false: Y軸方向に右へ転がす
		void rollY(boolean isReverse) {
			if(!isReverse) roll(Face.TOP, Face.LEFT, Face.BOTTOM, Face.RIGHT);
			else roll(Face.TOP, Face.RIGHT, Face.BOTTOM, Face.LEFT);
		}

		//true: Z軸方向に右へ回す
		//false: Z軸方向に左へ回す
		void rollZ(boolean isReverse) {
			if(!isReverse) roll(Face.FRONT, Face.LEFT, Face.BACK, Face.RIGHT);
			else roll(Face.FRONT, Face.RIGHT, Face.BACK, Face.LEFT);
		}

		private void roll(Face w, Face x, Face y, Face z) {
			Integer tmp = id[w.ordinal()];
			id[w.ordinal()] = id[x.ordinal()];
			id[x.ordinal()] = id[y.ordinal()];
			id[y.ordinal()] = id[z.ordinal()];
			id[z.ordinal()] = tmp;
		}

		@Override
		public String toString() {
			String str = "";
			for(Face f : Face.values()){
				str += id[f.ordinal()] + " ";
			}
			return str;
		}

		@Override
		public int hashCode() {
			int hash = 31;
			for(Face f : Face.values()){
				hash += hash*17+id[f.ordinal()].hashCode();
			}
			return hash;
		}
	}



}