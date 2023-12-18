public class Main {
    public static void main(String[] args){
        if(args.length == 0){
            args = new String[] {"99","1"};    
        }
        int t = Integer.parseInt(args[0]);
        int x = Integer.parseInt(args[1]);
        Double dt = (double)t;
        Double dx = (double)x;
        answer = String.format("%.5f",dt/dx);
        System.out.println(answer);
    }
}