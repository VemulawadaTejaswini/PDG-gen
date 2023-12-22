import java.util.*;
class Main {
    public static void main(String args[])
    {
        while(true){
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            int s = sc.nextInt();
            if(x == 0 && y == 0 && s == 0){
                break;
            }
            //      System.out.println("x "+x+"y "+y+"s "+s);                                                                   
            int maxvalue = 0;
            for(int c1 = 1;c1 < s;c1++){
                for (int c2 = 1;c2 < s;c2++){
                    if (consumption(c1,x)+consumption(c2,x) == s){
                        if (consumption(c1,y)+consumption(c2,y)> maxvalue){
                            maxvalue = consumption(c1,y)+consumption(c2,y);
                        }
                    }
                }
            }
            System.out.println(maxvalue);
        }
    }
    static int consumption(int c,int a){
        return((int)Math.floor((double)c*(double)(100+a)/100));
    }
}