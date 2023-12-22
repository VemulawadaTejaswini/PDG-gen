import java.util.Scanner;

public class Main{
    public static void main(String args[]){

    Scanner scan = new Scanner(System.in);

    
    //String n2 = scan.next();
    //String s = scan.next();

    int a = scan.nextInt();
    int b = scan.nextInt();

    int h = scan.nextInt();
    int m = scan.nextInt();

    double e1 = (h * 60 + m) * 0.5;
    double e2 = m * 360 / 60;

    double e = Math.abs(e1-e2);

    if (e>180){
        e = 360 - e;
    }

    //System.out.println(e);


    double r=Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*b*a*Math.cos(Math.toRadians(e)));

    System.out.println(r);


      scan.close();
    }
  }