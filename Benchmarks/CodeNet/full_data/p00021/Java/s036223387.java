import java.util.Scanner;
public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);	
	int n=sc.nextInt();
	double []x=new double[4];
	double []y=new double[4];
	for(int j=0;j<n;j++){
	  for(int i=0;i<4;i++){
		  x[i]=sc.nextDouble();
	      y[i]=sc.nextDouble();
	  }
	  double ab=(y[1]-y[0])/(x[1]-x[0]);
	  double cd=(y[3]-y[2])/(x[3]-x[2]);
	  if(ab==cd){System.out.println("YES");
     }else{System.out.println("NO");
	  }
	}
    }
 }