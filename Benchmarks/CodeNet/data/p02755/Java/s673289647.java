import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        double x = Math.floor(12.5*A);
        double y = Math.floor(10*B);
        ArrayList<Integer> List = new ArrayList<>();
        if(x==y) System.out.println((int)x);
        else{
            double a = Math.floor(y*0.08);
            double b = Math.floor(x*0.1);
            if(a==A) List.add((int)y);
            if(b==B) List.add((int)x);
            if(List.size()==0) System.out.println(-1);
            else System.out.println(Collections.min(List));
        }
    }
}