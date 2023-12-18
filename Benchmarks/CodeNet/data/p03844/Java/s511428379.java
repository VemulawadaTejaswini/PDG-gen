public class Main{
    public static void main(String[] arg){
        int a = Integer.getInteger(arg[0]);
        int b = Integer.getInteger(arg[2]);
        String op = arg[1];
        
        if(op.equals("+")){
            System.out.println(a + b);
        }else if(op.equals("-")){
            System.out.println(a - b);
        }
    }
}
