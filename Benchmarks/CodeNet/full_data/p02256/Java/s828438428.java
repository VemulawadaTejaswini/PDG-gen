import java.util.*; 

public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int x,y;
        int max;
        int t=1;
        x = stdIn.nextInt();
        y = stdIn.nextInt();
        max = x;

        if(y>max) max = y;
        for(int i=1;i<max;i++){
            if(x%i==0&&y%i==0){
                t = i;
            }
        }

        System.out.println(t);
    }
}
