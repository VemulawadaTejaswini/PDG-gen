import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc;
		String str="";
		int kakudo=90;
		int kyori=0,kaiten=0;
		float posx=0,posy=0;

		sc=new Scanner(System.in);
		while(sc.hasNext()) {
			str=sc.next();
			String[] pr=str.split(",");
			kyori=Integer.parseInt(pr[0]);
			kaiten=Integer.parseInt(pr[1]);
			kakudo+=kaiten;
			posx+=((float)kyori)*Math.cos(((double)kaiten)*Math.PI/180);
			posx+=((float)kyori)*Math.sin(((double)kaiten)*Math.PI/180);
			sc=new Scanner(System.in);
		}
		System.out.println((int)posx);
		System.out.println((int)posy);
		sc.close();
	}
}
