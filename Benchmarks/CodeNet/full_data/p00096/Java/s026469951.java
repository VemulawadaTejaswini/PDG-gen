import java.awt.Point;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;

public class Main {	
	Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new AOJ0096();
	}
	class AOJ0096{
		int doIt(){
			int result=0;
			int n=in.nextInt();
			/*(a,b)+(c,d)と考える。
			 * n=2で
			 * (a,b)=0なら1通り(0,0)      *       (c,d)=(1,1)(2,0)(0,2) =3
			 * 		=1なら2通り(1,0)(0,1)			     =(1,0)(0,1)      =4
			 * 		=2なら3通り(1,1)(2,0)(0,2)         =(0,0)          =3
			 * 

			 * (a,b)=0なら1通り(0,0)
			 *      =1なら2通り(1,0)(0,1)
			 *      =2なら3通り(1,1)(2,0)(0,2)
			 *      =3なら4通り(3,0)(0,3)(1,2)(2,1)
			 *      =4なら5通り(0,4)(4,0)(1,3)(3,1)(2,2)
			 *      =5なら6通り(0,5)(5,0)(1,4)(4,1)(2,3)(3,2)
			 *      =6なら7通り(6,0)(0,6)(1,5)(5,1)(2,4)(4,2)(3,3)
			 *      =7なら8通り(7,0)(0,7)(1,6)(6,1)(2,5)(5,2)(3,4)(4,3)
			 *      
			 */
			int ab[] = new int[n+1];
			int cd[] = new int[n+1];
			for(int i=0;i<=n;i++){
				ab[i]=i+1;
				cd[i]=i+1;
			}
			for(int i=0;i<=n;i++)result+=ab[i]*cd[n-i];
			return result;
		}
		public AOJ0096() {
			while(in.hasNext())System.out.println(doIt());
		}
	}

}