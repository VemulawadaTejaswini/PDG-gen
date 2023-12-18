import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		long H=stdIn.nextLong();
		long W=stdIn.nextLong();
		long min=1000000;
		long z=1;
		if(H%3==0||W%3==0)
			System.out.println(0);
		else{
			while(H-1>z){
				if(W/2*z<(H-z)*W){
					if(min>((H-z)*W)-(W/2*z))
						min=((H-z)*W)-(W/2*z);
				}
				else{
					if(min>(W/2*z)-((H-z)*W))
						min=(W/2*z)-((H-z)*W);
				}
				z++;
			}z=1;
			while(W-1>z){
				if(H/2*z<(W-z)*H){
					if(min>((W-z)*H)-(H/2*z))
						min=((W-z)*H)-(H/2*z);
				}
				else{
					if(min>(H/2*z)-((W-z)*H))
						min=(H/2*z)-((W-z)*H);
				}
				z++;
			}z=0;
			if(min>(W/3+1)*H-(W/3*H))
				min=(W/3+1)*H-(W/3*H);
			if(min>(H/3+1)*W-(H/3*W))
				min=(H/3+1)*W-(H/3*W);
		}
		System.out.println(min);
	}
}