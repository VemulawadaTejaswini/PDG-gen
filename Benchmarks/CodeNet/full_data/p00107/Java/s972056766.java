import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="";
		int c_t=0,c_y=0,c_o=0;
		int wa=0;
		int sets=0;
		while(true) {
			c_t=sc.nextInt();
			c_y=sc.nextInt();
			c_o=sc.nextInt();
			wa=c_t+c_y+c_o;

			int min=Math.min(c_t, Math.min(c_y, c_o));
			int max=Math.max(c_t, Math.max(c_y, c_o));
			int nak=wa-min-max;
			int hki=min*min+nak*nak;
			hki=hki/4;
			System.out.println(hki);
			if(c_t*c_y*c_o==0) {
				System.exit(0);
			}
			sets=sc.nextInt();
			int[] ookisa=new int[sets];
			for(int i=0; i<sets; i++) {
				ookisa[i]=sc.nextInt();
				if(hki<ookisa[i]*ookisa[i]) {
					System.out.println("OK");
				}
				else {
					System.out.println("NA");
				}
			}
		}
	}
}
