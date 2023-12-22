import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int y,m,d;
		while(sc.hasNext()){
			y=sc.nextInt();
			m=sc.nextInt();
			d=sc.nextInt();
			//heisei
			if(1990<y) System.out.printf("heisei %d %d %d\n",y-1988,m,d);
			else if(y==1989 && 1<m) System.out.printf("heisei 1 %d %d\n",m,d);
			else if(y==1989 && m==1 && 7<d) System.out.printf("heisei 1% d %d\n",m,d);
			//showa
			else if(1927<y) System.out.printf("showa %d %d %d\n",y-1925,m,d);
			else if(y==1926 && m==12 && 24<d) System.out.printf("showa1 %d %d\n",m,d);
			//taisyo
			else if(1913<y) System.out.printf("taisho %d %d %d\n",y-1911,m,d);
			else if(y==1912 && 7<m) System.out.printf("taisho 1 %d %d\n",m,d);
			else if(y==1912 && m==7 && 29<d) System.out.printf("taisho 1 %d %d\n",m,d);
			//
			else if(1869<y) System.out.printf("meiji %d %d %d\n",y-1867,m,d);
			else if(y==1868 && 9<m) System.out.printf("meiji 1 %d %d\n",m,d);
			else if(y==1868 && m==9 && 7<d) System.out.printf("meiji 1 %d %d\n",m,d);
			else System.out.printf("pre-meiji\n");
		}
	}
}