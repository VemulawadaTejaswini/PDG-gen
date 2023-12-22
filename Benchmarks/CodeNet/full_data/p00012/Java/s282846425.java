import java.util.Scanner;

public class Main {

public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  float[] x = new float[3];
  float[] y = new float[3];
  while (in.hasNext()) {
	{
	  for (int i = 0; i < 3; i++) {
		x[i] = in.nextFloat();
		y[i] = in.nextFloat();
	  }
	  float px = in.nextFloat();
	  float py = in.nextFloat();
	  for (int i = 0; i < 3; i++) {
		x[i] -= px;
		y[i] -= py;
	  }
	}
	/*
	 * 原点から頂点に向かって引っ張ったときの力のつりあいで考える。
	 * ひとつの頂点からひっぱた時ほかの二つの頂点も引っ張りの状態であれば OK
	 * x[0]=A*x[1]+B*x[2] y[0]=A*y[1]+B*y[2] A>0,B>0であればOK
	 */
	float[] AB = f(x, y);
	if (AB[0] >= 0 && AB[1] >= 0) {
	  System.out.println("YES");
	} else {
	  System.out.println("No");
	}
  }
}

private static float[] f(float[] x, float[] y) {
  x[0] = -x[0];
  y[0] = -y[0];
  float D = x[1] * y[1] - x[2] * x[0];
  float xx = +y[1] * y[2] - x[2] * y[0];
  float yy = +x[1] * y[0] - x[0] * y[2];
  return new float[] { (xx / D), (yy / D) };
}
}