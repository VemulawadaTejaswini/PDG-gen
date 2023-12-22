import java.util.Scanner;

public class Main {
	public static void main(String[] wjy) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k=0;
		//ArrayList<Integer> tar = new ArrayList<Integer>();
		for (int i= 0;i<num;i++) {
			int aim = sc.nextInt();
			if (Pri(aim)) {
				//tar.add(aim);
				k++;
			}
		}
		//System.out.println(tar);
		System.out.println(k);
	}
	public static boolean Pri(int a) {
		if (a<=3) {
			return a>1;
		}
		else {
			if (a%2==0) {
				return false;
			}
		    if (a%3==0) {
		    	return false;
		    }
		    int k =5;
		    while ((k*k)<=a) {
		    	if (a% k == 0) {
		    		return false;
		    	}
		    	else if (a%(k+2)==0) {
		    		return false;
		    	}
		    	k=k+6;
		    }
		    return true;
		}
	}
}

