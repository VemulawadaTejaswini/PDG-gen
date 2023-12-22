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

			for(int i=0;i<=2000;i++){
				if(n-i<0)break;
				if(n-i>2000)continue;
				result+=list[i]*list[n-i];
			}
			return result;
		}
		int[] list;
		public AOJ0096() {
			list = new int[2001];
			for(int i=0;i<=1000;i++)for(int s=0;s<=1000;s++)list[s+i]++;
			while(in.hasNext())System.out.println(doIt());
		}
	}

}