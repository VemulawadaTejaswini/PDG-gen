import java.io.BufferedReader;
import java.io.InputStreamReader;


class Computes{

	public float[] Solve(int a, int b, int c, int d, int e, int f){
		float[] sols = new float[2];
		/*int x , y;
		x = 2; y= 14;
		float z = (float) x/y;
		System.out.printf("%.3f \n",z);*/
		sols[0] = (float) (e*c-b*f)/(a*e-b*d);
		sols[1] = (float) (a*f-d*c)/(a*e-b*d);
		return sols;
	}
}

public class Main {
	 //String[] strs = new String[6];
	 //int[] ints = new int[6];
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		Computes comp = new Computes();
		try{
			for(;;){
		line = br.readLine();
		if(line!=null){
			String[] strs = line.split(" ");
			int[] ints = new int[strs.length];
			for(int i = 0; i< strs.length ; i++){
				 ints[i] = Integer.parseInt(strs[i]);
			}
			float[] sols = comp.Solve(ints[0], ints[1], ints[2], ints[3], ints[4], ints[5]);
			System.out.printf("%.3f %.3f\n",sols[0],sols[1]);
		} else {break;}
		}
		} catch(Exception e){}
	}

}