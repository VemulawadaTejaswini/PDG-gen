public class Main{
    public static void main(String[] args){
        int x, cube;
        x = new Integer(args[0]);
 
        if(1 <= x && x <= 100){
            cube = x * x * x;
            System.out.println(cube);
        } else
            return;
    }
}