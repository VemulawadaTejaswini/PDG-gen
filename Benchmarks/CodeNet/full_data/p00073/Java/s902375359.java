import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        while(true){
           String line=sc.nextLine();
String line2=sc.nextLine();
            if((line.equals("0")&&line2.equals("0"))){
                break;
            }
            double []j=new double[2];
            j[0]=Double.parseDouble(line);
            j[1]=Double.parseDouble(line2);
            System.out.println(j[0]*j[0]+2*Math.sqrt((j[0]/2)*(j[0]/2)+j[1]*j[1])*j[0]);
        }
    }
}
