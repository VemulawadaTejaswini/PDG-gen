      import java.util.Scanner;     
    public static void main(String[] args){
            	Scanner scan  = new Scanner(System.in);
      			double Pai = 3.141592653589793238462643383279;
              	double a = scan.nextInt();
              	double b = scan.nextInt();
              	double h = scan.nextInt();
              	double m = scan.nextInt();
              
              	double rad = Pai*2*(h/12.0 + (60.0/m)/12.0 - m/60.0);
              
              	double rpe = (a*a + b*b) - (2*a*b)*Math.cos(rad);
              	 
              	System.out.println(rpe);
              
            }
            }