import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String[] z =s.nextLine().split(" ");
        int n=Integer.parseInt(z[0]);
        int d=Integer.parseInt(z[1])*2+1;
        for(int i=1;i<= 1000;i++){
            if(n <= d*i){
                System.out.println(i);
                break;
            }
        }
    }
}