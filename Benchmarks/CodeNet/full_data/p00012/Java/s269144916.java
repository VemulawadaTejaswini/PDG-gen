import java.io.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		while(true){
			Point tri[] = new Point[3];
			for(int i = 0; i < 3; i++){
				tri[i] = new Point();
			}
			Point s = new Point();
			s.x = 1.0;
			s.y = 0.0;
			
			int n = 8;
			String c = br.readLine();
			if(c.equals(""))break;
			
			for(int i = 0; i < 8; i++){
				if(c.indexOf(" ") !=  -1){
					String str = c.substring(0, c.indexOf(" "));
					if(i < 6){
						if(i%2==0){
							tri[i/2].x = Double.parseDouble(str);
						}
						else
							tri[i/2].y = Double.parseDouble(str);
						c = c.substring(c.indexOf(" ") + 1);
					}

					else{
						s.x = Double.parseDouble(str);
						c = c.substring(c.indexOf(" ") + 1);
					}
				}
				else{
					s.y = Double.parseDouble(c);
				}
			}
			
			boolean f = true;
			boolean gyaku = false;
			for(int i = 0; i < 3; i++){
				if(!tri[(i+2)%3].isLeft(tri[i%3],tri[(i+1)%3])){
					gyaku = true;
					break;
				}
				if(!s.isLeft(tri[i],tri[(i+1)%3])){
					f = false;
				}
			}

			if(gyaku){
				for(int i = 2; i >= 0; i--){
					/*if(!tri[(i+1)%3].isLeft(tri[i],tri[i%3])){
						System.out.println("gyaku break");	
						break;
					}*/

					if(!s.isLeft(tri[i], tri[(i+2)%3])){
						f = false;
					}
				}
			}
				if(f)
					System.out.println("YES");
				else
				System.out.println("NO");
			
			
			
		}
	}
}

final class Point{
	public double x;
	public double y;

	public boolean isLeft(Point p, Point q) {
	// ÀµÄ­¾³¢
	// xNg p -> q ÆxNg p -> this Ì¬·½slÓ`Ì
	// tÊÏª³ÈçÎ true »¤ÅÈ¯êÎfalse ðÔ·B
	// tÊÏÌvZÉÍºÌ\bh signedArea ðp¢éB

	// xNgp -> qÍ(q.x-p.x , q.y-p.y)Å è
	// xNgp -> thisÍ(this.x-p.x , this.y-p.y)Å é
	// ±ÌñÂÌxNgª¬·½slÓ`ÌtÊÏðvZµÄ
	// »êª³ÈçtrueAÈçÎfalseðÔ·
	if(signedArea(q.x-p.x, q.y-p.y, this.x-p.x, this.y-p.y) > 0){
		return true;
	}
	else
		return false;
	}
	public double signedArea(double x1, double y1, double x2, double y2) {
	return x1 * y2 - x2 * y1;
	}


	}