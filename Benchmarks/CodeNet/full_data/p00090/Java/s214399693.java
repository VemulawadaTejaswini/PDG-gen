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
			byte	maxlap = 0;	// シールの重なっている最大枚数

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
 
	private static boolean isLap(double[] point1, double[] point2) {
		boolean	bStatus = false;

		if (point1 != null && point2 != null) {
			bStatus = (Math.sqrt(Math.pow(point1[0] - point2[0], 2.0) + Math.pow(point1[1] - point2[1], 2.0)) < 2.0);
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