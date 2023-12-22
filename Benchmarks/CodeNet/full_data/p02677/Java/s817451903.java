import java.util.*;

class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    
    double A = sc.nextDouble();
    double B = sc.nextDouble();
    double H = sc.nextDouble();
    double M = sc.nextDouble();
    
    double angleH = (H/12 + M/60/12) * Math.PI*2;
    double angleM = M / 60 * Math.PI*2;
    
    double difference = angleH - angleM;
    
    double cosTheta = Math.cos(difference);
    
    double answer = Math.sqrt(Math.pow(A,2) + Math.pow(B,2) - (2*A*B*cosTheta));
    
    System.out.println(answer);
  }
}