
import java.util.*;

public class Main {
    public static boolean[] booleans=new boolean[2000*20];
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        final int n=scanner.nextInt();

        rec(0,n,new Position(0,0),new Position(100,0));
        System.out.println(new Position(100,0));
    }
    public static void rec(int currentIndex,int endIndex,Position start,Position end){
        if(currentIndex==endIndex){
            System.out.println(start);
            return;
        }
        double r=Math.sqrt(3)/6.0*(end.x-start.x);
        Position position1=new Position(start.x,start.y);
        Position position2=new Position(start.x+(end.x-start.x)/3.0,start.y+(end.y-start.y)/3.0);
        Position position3=new Position((start.x+end.x)/2.0+r*((start.y-end.y)/(end.x-start.x)),(start.y+end.y)/2.0+r);
        Position position4=new Position(start.x+(end.x-start.x)*2.0/3.0,start.y+(end.y-start.y)*2.0/3.0);
        Position position5=new Position(end.x,end.y);
        rec(currentIndex+1,endIndex,position1,position2);
        rec(currentIndex+1,endIndex,position2,position3);
        rec(currentIndex+1,endIndex,position3,position4);
        rec(currentIndex+1,endIndex,position4,position5);
    }

}

class Position{
    public  double x,y;
    private Position(){}
    public Position(double x,double y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return String.format("%f %f",x,y);
    }
}
