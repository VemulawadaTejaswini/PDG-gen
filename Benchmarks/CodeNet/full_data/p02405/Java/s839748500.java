import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		int a=n.nextInt();int b=n.nextInt();
		StringBuilder sb=new StringBuilder("");
		while (a!=0 || b!=0){
			sb=new StringBuilder("");
				for (int c=0;c<a;c++){
					if ((c%2)==0){
						for (int d=0;d<b;d++){
							sb.append("#");
						}
						for (int e=1;e<b;e+=2){
							sb.replace(e,e+1,".");
						}
					}else{
						for (int f=0;f<b;f++){
							sb.append(".");
						}
						for (int g=1;g<b;g+=2){
							sb.replace(g,g+1,"#");
						}
					}
					System.out.println(sb);
					sb=new StringBuilder("");
				}
			a=n.nextInt();b=n.nextInt();
			System.out.println(sb);
		}
	}
}