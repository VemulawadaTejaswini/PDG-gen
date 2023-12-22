import java.math.BigDecimal;
import java.sql.Array;
import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		boolean good = true;
		for (long i = -64; i < 64; i++) {
			for (long j = -64; j < 64; j++) {
				if((i*i*i*i*i)-(j*j*j*j*j)==X){
					System.out.println(i+" "+j);
					good = false;
					break;
				}		
			}
			if(!good){
				break;
			}
		}

		if(good){
		for (long i = 64; i < 128; i++) {
			for (long j = 64; j < 128; j++) {
				if((i*i*i*i*i)-(j*j*j*j*j)==X){
					System.out.println(i+" "+j);
					good =false;
					break;
				}		
			}
			if(!good){
				break;
			}
		}
		}
		if(good){
		for (long i = -128; i <= -64; i++) {
			for (long j = -128; j <= -64; j++) {
				if((i*i*i*i*i)-(j*j*j*j*j)==X){
					System.out.println(i+" "+j);
					good = false;
					break;
				}		
			}
			if(!good){
				break;
			}
		}
		}
		sc.close();
    }	
		
}