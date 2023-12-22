import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, L, D, M, L_ok, D_ok, M_ok;
	static int hour, in_time, out_time;
	public static void main(String[] args) {
		while(read()){

		}
		System.out.print("lunch ");
		if(L == 0){
			System.out.println("no guest");
		}else{
			double printL = (double)L_ok/L;
			System.out.println((int)Math.ceil(printL*100));
		}
		System.out.print("dinner ");
		if(D == 0){
			System.out.println("no guest");
		}else{
			double printD = (double)D_ok/D;
			System.out.println((int)Math.ceil(printD*100));
		}
		System.out.print("midnight ");
		if(M == 0){
			System.out.println("no guest");
		}else{
			double printM = (double)M_ok/M;
			System.out.println((int)Math.ceil(printM*100));
		}
	}
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		for(int i = 0; i < n; i++){
			String line = sc.next();
			String[] devide = line.split(":");
			hour = Integer.parseInt(devide[0]);
			in_time = Integer.parseInt(devide[1]);
			out_time = sc.nextInt();
			//System.out.println("hour" + hour);
			//System.out.println("in_time" + in_time);
			//System.out.println("out_time" + out_time);
			solve();
		}
		return true;
	}
	static void solve(){
		if(11 <= hour && hour <= 14){
			L++;
			if(in_time >= 52){
				if(in_time <= out_time && out_time <= 59){
					L_ok++;
				}else if(out_time + 60 - in_time <= 8){
					L_ok++;
				}
			}else{
				if(out_time - in_time <= 8)
					L_ok++;
			}
		}else if(18 <= hour && hour <= 20){
			D++;
			if(in_time >= 52){
				if(in_time <= out_time && out_time <= 59){
					D_ok++;
				}else if(out_time + 60 - in_time <= 8){
					D_ok++;
				}
			}else{
				if(out_time - in_time <= 8)
					D_ok++;
			}
		}else if(21 <= hour && hour <= 1){
			M++;
			if(in_time >= 52){
				if(in_time <= out_time && out_time <= 59){
					M_ok++;
				}else if(out_time + 60 - in_time <= 8){
					M_ok++;
				}
			}else{
				if(out_time - in_time <= 8)
					M_ok++;
			}
		}
	}
}