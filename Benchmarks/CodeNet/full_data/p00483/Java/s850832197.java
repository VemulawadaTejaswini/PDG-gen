import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		char[][] map = new char[m][n];
		int k = scan.nextInt();
		for(int i = 0;i < m;i++){
			map[i] = scan.next().toCharArray();
		}
		int a,b,c,d;
		int jC = 0,iC = 0,oC = 0;
		for(int i = 0;i < k;i++){
			a = scan.nextInt() - 1;
			b = scan.nextInt() - 1;
			c = scan.nextInt();
			d = scan.nextInt();
			jC = 0;
			iC = 0;
			oC = 0;
			for(int j = a;j < c;j++){
				for(int l = b;l < d;l++){
					switch(map[j][l]){
						case 'J':
							jC++;
							break;
						case 'O':
							oC++;
							break;
						case 'I':
							iC++;
							break;
						default:
							break;
					}
				}
			}
			System.out.println(jC + " " + oC + " " + iC);
		}
	}
}