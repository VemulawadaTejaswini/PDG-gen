import java.util.Scanner;

class Main{
	static String judge(double xp0, double yp0, double xp1, double yp1, double xp2, double yp2){
		double[] p1_to_p2 = {xp2 - xp1, yp2 - yp1};
		//double BorderLine = p1_to_p2[1] / p1_to_p2[0];
		double[] p1 = {xp1 - xp0, yp1 - yp0};
		double[] p2 = {xp2 - xp0, yp2 - yp0};

		if(cross(p1, p2)){ //parallel
			if(normSqr(p1) >= normSqr(p2) && inPro(p1, p2) >= 0){ //ON_SEGMENT?
				return("ON_SEGMENT");
			}else{
				if(normSqr(p2) > normSqr(p1) && inPro(p1, p2) >= 0){
					return("ONLINE_FRONT");
				}else{
					return("ONLINE_BACK");
				}
			}
		}else{ //not_parallel
			if(isThisClockwise(p1, p2)){
				return("CLOCKWISE");
			}else{
				return("COUNTER_CLOCKWISE");
			}
		}
	}

	static boolean isThisClockwise(double[] p1, double[] p2){
		double[] p1_to_p2 = {p2[0] - p1[0], p2[1] - p1[1]};

		if(p1_to_p2[0] == 0){
			if(p1_to_p2[1] >= 0){
				if(p1[0] >= 0){
					return false;
				}else{
					return true;
				}
			}else{
				if(p1[0] >= 0){
					return true;
				}else{
					return false;
				}
			}
		}else if(p1_to_p2[1] == 0){
			if(p1_to_p2[0] >= 0){
				if(p1[1] >= 0){
					return true;
				}else{
					return false;
				}
			}else{
				if(p1[1] >= 0){
					return false;
				}else{
					return true;
				}
			}
		}else{
			double t = - p1[0] / p1_to_p2[0];
			if(p1[1] + t * p1_to_p2[1] >= 0){ //????????????????°?????????????
				if(p1_to_p2[0] >= 0){
					return true;
				}else{
					return false;
				}
			}else{
				if(p1_to_p2[0] >= 0){
					return false;
				}else{
					return true;
				}
			}
		}
	}

	static boolean cross(double[] p1, double[] p2){
		return((p1[0]*p2[1] - p1[1]*p2[0] == 0) ? (true) : (false));
	}

	static double inPro(double[] p1, double[] p2){
		return(p1[0] * p2[0] + p1[1] * p2[1]);
	}

	static double normSqr(double[] p){
		return(p[0]*p[0] + p[1]*p[1]);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int xp0 = in.nextInt();
		int yp0 = in.nextInt();
		int xp1 = in.nextInt();
		int yp1 = in.nextInt();
		int q = in.nextInt();

		for(int i = 0; i < q; i ++){
			System.out.println(judge(xp0, yp0, xp1, yp1, in.nextInt(), in.nextInt()));
		}

	}
}