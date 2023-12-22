
public class Main {
	public static void main(String args[]){
		double cx1, cy1, r1;
		double cx2, cy2, r2;
		
		if(args.length != 0){
			cx1 = Double.valueOf(args[0]);
			cy1 = Double.valueOf(args[1]);
			r1 = Double.valueOf(args[2]);
			cx2 = Double.valueOf(args[3]);
			cy2 = Double.valueOf(args[4]);
			r2 = Double.valueOf(args[5]);
			
			double l = (Math.pow(cx1 - cx2, 2) + Math.pow(cy1 - cy2, 2));
			double rlen = r1+r2;
			double revlen = r1 - r2;
			if(l > rlen*rlen) 
				System.out.println("4");
			else if(l == rlen*rlen) 
				System.out.println("3");
			else if(l < rlen*rlen) {
				if(l > revlen*revlen)
					System.out.println("2");
				else if(l == revlen*revlen)
					System.out.println("1");
				else if(l < revlen*revlen)
					System.out.println("0");
			}
		}
		else System.out.println("Input doesn't be exist");
	}	
}

