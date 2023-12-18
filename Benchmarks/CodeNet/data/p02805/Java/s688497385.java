import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double c = 0;
		double d = 0;
        double e = 0;
        double f = 0;
        double g = 0;
        int [] in = new int [a];
        int [] in2 = new int [a];
        for(int i=0;i<a;i++){in[i] = sc.nextInt(); e+=in[i]; in2[i] = sc.nextInt(); f+=in2[i];                             
                            }		        
        e/=a;
        f/=a;
        for(int i=0;i<a;i++){c=(e-in[i])*(e-in[i]);d=(f-in[i])*(f-in[i]);if(Math.sqrt(c+d)>g){g=Math.sqrt(c+d);}
          }
		System.out.println(g);
	}
}