
public class Abc164 {
	public static void main(String args[]) {
	int sheep = Integer.parseInt(args[0]);
	int wolf =  Integer.parseInt(args[1]);


	if(sheep >100 || sheep < 0) {
		return;
	}
	if(wolf >100 || wolf < 0) {
		return;
	}

	if(sheep <= wolf) {
		System.out.println("unsafe");
	}else {
		System.out.println("safe");
	}

	}

}
