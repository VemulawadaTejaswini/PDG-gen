public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0;i<n;i++){
			int[] s = new int[13];
			int[] h = new int[13];
			int[] c = new int[13];
			int[] d = new int[13];
			int num = 0;

			for(num = 0;num<13;num++){
				if("S".equals(s[num])){
					s[num] = i+1;
					num++;
				}else if("H".equals(h[num])){
					h[num] = i+1;
					num++;
				}else if("C".equals(c[num])){
					c[num] = i+1;
					num++;
				}else if("D".equals(d[num])){
					d[num] = i+1;
					num++;
				}
			}


			if(i == 0){
				System.out.println("S"+" "+(i+1));
			}else if(i == 0){
				System.out.println("H"+" "+(i+1));
			}else if(i == 0){
				System.out.println("C"+" "+(i+1));
			}else if(i == 0){
				System.out.println("D"+" "+(i+1));
			}
		}
	}
}