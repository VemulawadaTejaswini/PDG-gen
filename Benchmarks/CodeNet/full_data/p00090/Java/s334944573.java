import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader	br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		double[][]	seals = null;			// シールの座標
		byte[]		laps  = new byte[100];	// シールの重なっている枚数

		while ((seals = parseSealNum()) != null) {
			byte	maxlap = 1;	// シールの重なっている最大枚数

			for (int loop1 = 0; loop1 < seals.length; loop1++) {
				seals[loop1] = parseSealPoint();
				laps[loop1]  = 1;
				for (int loop2 = 0; loop2 < loop1; loop2++) {
					if (isLap(seals[loop1], seals[loop2])) {
						laps[loop1]++;
						laps[loop2]++;
						maxlap = (byte)Math.max(maxlap, Math.max((int)laps[loop1], (int)laps[loop2]));
					}
				}
			}

			System.out.println(maxlap);
		}
	}
 
	private static boolean isLap(double[] p1, double[] p2) {
		boolean	bStatus = false;

		if (p1 != null && p2 != null) {
			double	length = Math.sqrt(Math.pow(p1[0] - p2[0], 2.0) + Math.pow(p1[1] - p2[1], 2.0));
			if (length - 2.0 <= 1e-6) {
				// 二つの円が交わってるかもしれない
				double		theta = Math.atan2(p2[1] - p1[1], p2[0] - p1[0]);
				double		alpha = Math.acos(length / 2.0);
				double[]	pc1 = {
					p1[0] + Math.cos(theta + alpha),
					p1[1] + Math.sin(theta + alpha)
				};
				double[]	pc2 = {
						p1[0] + Math.cos(theta - alpha),
						p1[1] + Math.sin(theta - alpha)
				};

				if (Math.sqrt(Math.pow(p1[0] - pc1[0], 2.0) + Math.pow(p1[1] - pc1[1], 2.0)) - 1.0 <= 1e-6) {
					bStatus = true;
				}
				if (Math.sqrt(Math.pow(p1[0] - pc2[0], 2.0) + Math.pow(p1[1] - pc2[1], 2.0)) - 1.0 <= 1e-6) {
					bStatus = true;
				}
			}
		}

		return bStatus;
	}
 
	private static double[][] parseSealNum() {
		double[][]	params = null;
        String		strin  = null;

        if ((strin = parseStdin()) != null) {
        	int	sealnum = Integer.parseInt(strin);
        	if (sealnum > 0) {
            	params = new double[sealnum][];
        	}
        }
 
        return params;
	}

	private static double[] parseSealPoint() {
		double[]	params = null;
        String		strin  = null;

        if ((strin = parseStdin()) != null) {
        	String[]	lines = strin.split(",");
        	params = new double[2];
        	for (int index = 0; index < lines.length; index++) {
        		params[index] = Double.parseDouble(lines[index]);
        	}
        }
 
        return params;
	}

	private static String parseStdin() {
        String  stdin = null;
        
        try {
        	String  tmp = br.readLine();
        	if (!tmp.isEmpty()) stdin = tmp;
        }
        catch (IOException e) {}
 
        return stdin;
	}
}