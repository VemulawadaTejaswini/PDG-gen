import java.util.*;

public class Main {
	static Long[] powI = new Long[121];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		Long X = sc.nextLong();
		boolean odd = false;
		if(X%2==1){
			odd = true;
		}
		Long a = (long) 1;

		for(int i=0; i<121; i++){
			powI[i]= (long) 0;
		}

		while(true){
			if(X%a==0){
				int ans = calc(X,a);
				if(ans!=0){
					System.out.println((ans+a) + " " + ans);
					return;
				}
			}
			if(odd){
				a += 2;
			}else{
				a++;
			}
		}
	}

	public static int calc(Long target, Long a){

		int b = 1;

		while(true){
			Long A = (long) 0;
          	if((b<120)){
              if(powI[b]==0){
                  A = (long) Math.pow(b,5);
                  powI[b]=A;
              }else{
                  A=powI[b];
              }
            }else{
              A = (long) Math.pow(b,5);
            }
			Long B = (long) Math.pow(a+b,5);
			boolean bl = false;
			if(B-A>target){
				bl = true;
			}
			if(B-A==target){
				return b;
			}

			B = (long) Math.pow(a-b,5);
			if(bl&&(B+A>target)){
				return 0;
			}
			if(B+A==target){
				return -b;
			}
			
			b++;
		}
	}
}
