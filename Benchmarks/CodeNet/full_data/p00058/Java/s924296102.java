import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            double[][]p=new double[4][2];
            for(int i=0;i<4;i++){
                p[i][0]=sc.nextDouble();
                p[i][1]=sc.nextDouble();
            }
            double x1=p[1][0]-p[0][0],y1=p[1][1]-p[0][1],x2=p[3][0]-p[2][0],y2=p[3][1]-p[2][1];
            if(x1*x2+y1*y2==0)	System.out.println("YES");
            else  System.out.println("NO");
            
        }
    }
}