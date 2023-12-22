package ITP1_5_A;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		int a=n.nextInt();int b=n.nextInt();
		while (a!=0 && b!=0){
			StringBuilder sb=new StringBuilder("");
				for (int c=0;c<b;c++){
					if ((c%2)==0){
						for (int d=1;d<a;d++){
							sb.append("#");
						}
						for (int d=1;d<b;d+=2){
							sb.replace(d,d,".");
						}
						System.out.println(sb);
						sb=new StringBuilder("");
					}else{
						for (int d=1;d<a;d++){
							sb.append(".");
						}
						for (int d=1;d<b;d+=2){
							sb.replace(d,d,"#");
						}
						System.out.println(sb);
						sb=new StringBuilder("");
					}
				}
			sb.append("\n");
			a=n.nextInt();b=n.nextInt();
			System.out.println("");
		}
	}
}