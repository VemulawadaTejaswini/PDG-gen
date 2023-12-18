public class Main {
//public class A_EntranceExamination {
    public static void main(String[] args){
//        if(args.length == 0){
//           args = new String[] {"8","3"};    
//       }
        int t = Integer.parseInt(args[0]);
        int x = Integer.parseInt(args[1]);
        Double dt = (double)t;
        Double dx = (double)x;
        String answer = String.format("%.10f",dt/dx);
        System.out.println(answer);
    }
}