import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class Dice {
	private final int N = 6;
	private final int X = 4;
	int surface[] = new int[6];
	int recover[] = new int[6];
	int axis_north[] = {0,1,5,4};
	int axis_east[] = {0,3,5,2};
	int axis_right[] = {1,2,4,3};
	int count;

	Dice() {
		count = 1;
		surface[0] = 1; // ???
		surface[1] = 2; // ??????
		surface[2] = 3; // ???
		surface[3] = 4; // ???
		surface[4] = 5; // ?\\
		surface[5] = 6; // ???
		UpdateRecoverVal();
	}

	public void OpNorth() {
		for (int i=0;i<X;i++) {
			surface[axis_north[i]] = recover[axis_north[(i+1)%X]];
		}
		UpdateRecoverVal();
		count += surface[0];
	}

	public void OpSouth() {
		for (int i=0;i<X;i++) {
			surface[axis_north[i]] = recover[axis_north[(i-1+X)%X]];
		}
		UpdateRecoverVal();
		count += surface[0];
	}

	public void OpEast() {
		for (int i=0;i<X;i++) {
			surface[axis_east[i]] = recover[axis_east[(i+1)%X]];
		}
		UpdateRecoverVal();
		count += surface[0];
	}

	public void OpWest() {
		for (int i=0;i<X;i++) {
			surface[axis_east[i]] = recover[axis_east[(i-1+X)%X]];
		}
		UpdateRecoverVal();
		count += surface[0];
	}

	public void OpRight() {
		for (int i=0;i<X;i++) {
			surface[axis_right[i]] = recover[axis_right[(i+1)%X]];
		}
		UpdateRecoverVal();
		count += surface[0];
	}

	public void OpLeft() {
		for (int i=0;i<X;i++) {
			surface[axis_right[i]] = recover[axis_right[(i-1+X)%X]];
		}
		UpdateRecoverVal();
		count += surface[0];
	}

	private void UpdateRecoverVal() {
		for (int i=0;i<N;i++) {
			recover[i] = surface[i];
		}
	}

	public void printCount() {
		System.out.println(this.count);
	}
}

class Main {
    public static void main(String args[]) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
 
        try {
            String buf = null;
            int n;
            while (!(buf = br.readLine()).equals("0")) {
				Dice d = new Dice();
                n = Integer.parseInt(buf);
				for (int i=0;i<n;i++) {
					String rot = br.readLine();
					if (rot.equals("North")) {
						d.OpNorth();
					} else if (rot.equals("South")) {
						d.OpSouth();
					} else if (rot.equals("West")) {
						d.OpWest();
					} else if (rot.equals("East")) {
						d.OpEast();
					} else if (rot.equals("Left")) {
						d.OpLeft();
					} else if (rot.equals("Right")) {
						d.OpRight();
					}
				}
				d.printCount();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}