public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int n = scan.nextInt();
		int s[] = new int[13];
		int h[] = new int[13];
		int c[] = new int[13];
		int d[] = new int[13];

		for(int num = 0;num<13;num++){
			String t = scan.next();
			if("S".equals(t)){
				int j = scan.nextInt();
				s[j-1]++;
			}else if("H".equals(h)){
				int j = scan.nextInt();
				h[j-1]++;
			}else if("C".equals(c)){
				int j = scan.nextInt();
				c[j-1]++;
			}else if("D".equals(d)){
				int j = scan.nextInt();
				d[j-1]++;
			}
		}

		for(int num=0;num<13;num++){
			if(s[num] == 0){
				int t = num+1;
				System.out.println("S "+t);
			}
		}
		for(int num=0;num<13;num++){
			if(h[num] == 0){
				int t = num+1;
				System.out.println("H "+t);
			}
		}
		for(int num=0;num<13;num++){
			if(c[num] == 0){
				int t = num+1;
				System.out.println("C "+t);
			}
		}
		for(int num=0;num<13;num++){
			if(d[num] == 0){
				int t = num+1;
				System.out.println("D "+t);
			}
		}
	}
}