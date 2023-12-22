import java.util.Scanner;
import java.lang.*;
public class Main{
        public static void main(String[] args) {
                // TODO Auto-generated method stub
    double[] p1=new double[2],p2=new double[2]; //[0]=x,[1]=y
    Scanner sca =new Scanner(System.in);
     int n=sca.nextInt();
     p1[0]=0.0;
     p2[0]=100.0;
     p1[1]=0.0;
     p2[1]=0.0;
     System.out.println(p1[0]+" "+p1[1]);
     koho(p1,p2,n);
     System.out.println(p2[0]+" "+p2[1]);
        }
    public static void koho(double p1[],double p2[],int n){
	if(n<1)return;
	double subx,suby;
	//referenced textbook method(use vectors)
	double[]beffro=new double[2],befback=new double[2];//(x,y)=([0],[1]);
	double[]afrote=new double[2];//Rotated vector
	double rotation = Math.toRadians(60);//require to rotate vectors(60 degree)
	beffro[0]=(2.0*p1[0]+p2[0])/3.0;//take dividing points
	beffro[1]=(2.0*p1[1]+p2[1])/3.0;
        befback[0]=(p1[0]+2.0*p2[0])/3.0;
	befback[1]=(p1[1]+2.0*p2[1])/3.0;
	subx=befback[0]-beffro[0];
	suby=befback[1]-beffro[1];
	afrote[0]=subx*Math.cos(rotation)-suby*Math.sin(rotation)+beffro[0];
	afrote[1]=subx*Math.sin(rotation)+suby*Math.cos(rotation)+beffro[1];
	//referenced rot formula.;
	koho(p1,beffro,n-1);
        System.out.println(beffro[0]+" "+beffro[1]);
	koho(beffro,afrote,n-1);
        System.out.println(afrote[0]+" "+afrote[1]);
	koho(afrote,befback,n-1);
        System.out.println(befback[0]+" "+befback[1]);
	koho(befback,p2,n-1);
    }
}


