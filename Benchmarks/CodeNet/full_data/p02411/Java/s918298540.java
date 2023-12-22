import java.util.*;


public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> rc = new ArrayList<Integer>();
		int r,c,i,d,ck;
		
		for(c=0;;c++){
			r=0;
			ck=0;
			for(i=0;i<3;i++){
				d = sc.nextInt();
				if(i<2&&d == -1){
					ck++;
				}
				if(i == 2 && r<50 && d >49){
					r = 50;
					break;
				}
				else if(i == 2 && r<50 && d < 50){
					d = -1;
				}
				else if(i == 2 && r>50){
					d = -1;
				}
				r += d;
				if(i == 2 && d == -1 && r != -3){
					r++;
				}
			}
			if(r == -3){
				c--;
				break;
			}
			if(ck>0){
				r=0;
			}
			rc.add(r);
		}
		sc.close();
		for(i=0;i<=c;i++){
			if(rc.get(i)>79){
				System.out.println("A");
			}
			else if(rc.get(i)>64){
				System.out.println("B");
			}
			else if(rc.get(i)>49){
				System.out.println("C");
			}
			else if(rc.get(i)>29){
				System.out.println("D");
			}
			else{
				System.out.println("F");
			}
		}
	}
}
