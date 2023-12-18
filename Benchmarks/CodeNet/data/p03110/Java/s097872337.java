import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double b[]=new double[a];
        String c[]=new String[a];
        double sum=0;
        for(int i=0;i<2;i++){
            b[i]=sc.nextDouble();
            c[i]=sc.next();
            if(c[i].equals("JPY")){
                sum+=b[i];
            }else {
                sum+=b[i]*380000;
            }
        }
        System.out.println(sum);
    }
}
