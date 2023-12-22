import java.util.Scanner;

class dice {
	int[] num = new int[6];
	dice(int[] d) {
		num = d;
	}
	public void NRoll() {
		int copy = num[0];
		num[0] = num[1];
		num[1] = num[5];
		num[5] = num[4];
		num[4] = copy;
	}
	public void WRoll() {
		int copy = num[0];
		num[0] = num[2];
		num[2] = num[5];
		num[5] = num[3];
		num[3] = copy;
	}
	public void ERoll() {
		int copy = num[0];
		num[0] = num[3];
		num[3] = num[5];
		num[5] = num[2];
		num[2] = copy;
	}
	public void SRoll() {
		int copy = num[0];
		num[0] = num[4];
		num[4] = num[5];
		num[5] = num[1];
		num[1] = copy;
	}
	public void wnum() {
		System.out.println(num[0]);
	}
}

public class Main{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int [] d=new int[6];
		for(int i=0;i<6;i++) {
			d[i]=sc.nextInt();
		}
		dice d1=new dice(d);
		String st=sc.next();
		String [] r=st.split("");
		for(int i=0;i<r.length;i++) {
			switch(r[i]){
			case "N":
			  d1.NRoll();
			  break;
			case "W":
			  d1.WRoll();
			  break;
			case "E":
			  d1.ERoll();
			  break;
			case "S":
			  d1.SRoll();
			  break;	
			}
		}
	d1.wnum();
	}
}

