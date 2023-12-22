import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	double[] func=new double[6];
	double x=0,y=0,siki=0,z=0,y1=0,y2=0,z1=0,z2=0;
	for(int i=0;i<6;i++){
	    double scan=sc.nextDouble();
	    func[i]=scan;
	}

	System.out.println(func[0]);

	y1=func[1]*func[3];
	y2=func[4]*func[0];
	z1=func[2]*func[3];
	z2=func[5]*func[0];
	y=y1-y2;
	z=z1-z2;
	y=z/y;
	y1=y*func[1];
	siki=func[2]-y1;
	x=siki/func[0];

	System.out.printf("%.3f  %.3f\n",x,y);
    }

}