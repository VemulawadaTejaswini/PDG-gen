import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = "";
        while(scan.hasNext()){
        	str += scan.next() + " ";
        }
        String[] nstr = str.split(" ");
        int n = nstr.length;
        double[][] point = new double[n][2];
        for(int i = 0;i < n;i++){
        	String[] s = nstr[i].split(",");
        	point[i][0] = Double.parseDouble(s[0]);
        	point[i][1] = Double.parseDouble(s[1]);
        }
        double sum = 0;
        for(int i = 1;i < n-1;i++){
        	double a = Math.sqrt((point[0][0] - point[i][0])*(point[0][0] - point[i][0])
        			+(point[0][1] - point[i][1])*(point[0][1] - point[i][1]));
        	double b = Math.sqrt((point[0][0] - point[i+1][0])*(point[0][0] - point[i+1][0])
        			+(point[0][1] - point[i+1][1])*(point[0][1] - point[i+1][1]));
        	double c = Math.sqrt((point[i][0] - point[i+1][0])*(point[i][0] - point[i+1][0])
        			+(point[i][1] - point[i+1][1])*(point[i][1] - point[i+1][1]));
        	double z = (a + b + c) / 2.0;
        	sum += Math.sqrt(z*(z-a)*(z-b)*(z-c));
        }
        System.out.printf("%.6f\n",sum);
    }
}