import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int[] a = new int[8];
			int[] b = new int[8];
			int[] c = new int[8];
			int[] d = new int[6];
			
			double[] at = new double[8];
			double[] bt = new double[8];
			double[] ct = new double[8];
			double[] dt = new double[6];
			double[] temp = new double[8];
			double[] tempd = new double[6];
			
			for(int i=0;i<8;i++){
				a[i] = sc.nextInt();
				at[i] = sc.nextDouble();
			}
			temp = Arrays.copyOf(at, 8);
			Arrays.sort(temp);
			for(int i=0;i<8;i++) if(at[i]==temp[0]) System.out.printf("%d %.2f\n", a[i],at[i]);
			for(int i=0;i<8;i++) if(at[i]==temp[1]) System.out.printf("%d %.2f\n", a[i],at[i]);
			for(int i=0;i<8;i++){
				if(at[i]==temp[2]){
					d[0] = a[i];
					dt[0] = at[i];
				}else if(at[i]==temp[3]){
					d[1] = a[i];
					dt[1] = at[i];
				}
			}
			
			for(int i=0;i<8;i++){
				b[i] = sc.nextInt();
				bt[i] = sc.nextDouble();
			}
			temp = Arrays.copyOf(bt, 8);
			Arrays.sort(temp);
			for(int i=0;i<8;i++) if(bt[i]==temp[0]) System.out.printf("%d %.2f\n", b[i],bt[i]);
			for(int i=0;i<8;i++) if(bt[i]==temp[1]) System.out.printf("%d %.2f\n", b[i],bt[i]);
			for(int i=0;i<8;i++){
				if(bt[i]==temp[2]){
					d[2] = b[i];
					dt[2] = bt[i];
				}else if(bt[i]==temp[3]){
					d[3] = b[i];
					dt[3] = bt[i];
				}
			}
			
			for(int i=0;i<8;i++){
				c[i] = sc.nextInt();
				ct[i] = sc.nextDouble();
			}
			temp = Arrays.copyOf(ct, 8);
			Arrays.sort(temp);
			for(int i=0;i<8;i++) if(ct[i]==temp[0]) System.out.printf("%d %.2f\n", c[i],ct[i]);
			for(int i=0;i<8;i++) if(ct[i]==temp[1]) System.out.printf("%d %.2f\n", c[i],ct[i]);
			for(int i=0;i<8;i++){
				if(ct[i]==temp[2]){
					d[4] = c[i];
					dt[4] = ct[i];
				}else if(ct[i]==temp[3]){
					d[5] = c[i];
					dt[5] = ct[i];
				}
			}
			
			tempd = Arrays.copyOf(dt, 6);
			Arrays.sort(tempd);
			for(int i=0;i<6;i++) if(dt[i]==tempd[0]) System.out.printf("%d %.2f\n", d[i],dt[i]);
			for(int i=0;i<6;i++) if(dt[i]==tempd[1]) System.out.printf("%d %.2f\n", d[i],dt[i]);
			
		}
	}	
}