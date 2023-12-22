import java.util.Scanner;
public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);	
	int n=sc.nextInt();
	double []po=new double[8];
	for(int j=0;j<n;j++){
	  for(int i=0;i<8;i++)po[i]=sc.nextDouble();
	  double ab=(po[2]-po[0])/(po[3]-po[1]);
	  double cd=(po[6]-po[4])/(po[7]-po[5]);
	  if(ab==cd){System.out.println("YES");
     }else{System.out.println("NO");
	  }
	}
    }
 }