import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double [] x1 = new double [a];
        double [] y1 = new double [a];
        double [] x2 = new double [a];
        double [] y2 = new double [a];
        int [] ans = new int [a];
      
        for(int i=0;i<a;i++){x1[i] = sc.nextDouble();
                             y1[i] = sc.nextDouble();
                             x2[i] = sc.nextDouble();
                             y2[i] = sc.nextDouble();
                            }
        int b = 0;
        for(int i=0;i<a;i++){double c = 1000000000;
        for(int j=0;j<a;j++){double d = 0; 
                             d+=Math.pow(x1[i]-x2[j]);
                             d+=Math.pow(y1[i]-y2[j]);
                             if(d<c){b=j;c=d;}
                             if(j==a-1){b=ans[i];}        
                            } 
                            }        
        for(int i=0;i<a;i++){System.out.println(ans[i]);}		
	}
}

