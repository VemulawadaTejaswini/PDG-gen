public class A_EntranceExamination {
    public static void main(String[] args){
        if(args.length == 0){
            args = new String[] {"8","3"};    
        }
        int t = Integer.parseInt(args[0]);
        int x = Integer.parseInt(args[1]);
        double dt = (double)t;
        double dx = (double)x;
        System.out.println(dt/dx);
    }
}