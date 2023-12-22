import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int count =0;
		int front = 0;
		int last = N-1;
		String c = sc.next();
		StringBuilder cc = new StringBuilder(c);
		while(true) {
			label1: for(int i=front; i<last; i++) {
				if(cc.substring(i,i+1).equals("W")) {
					for(int j=last; j>i;j--) {
						if(cc.substring(j,j+1).equals("R")) {
							cc.setCharAt(i, 'R');
							cc.setCharAt(j, 'W');
							front = i;
							last = j;
//							i = front-1;
//							j = j-1;
							count++;
							break ;
						}
					}
				}
			}
//					System.out.println(cc.toString());
					System.out.println(count);
					return;
		}

	}
}