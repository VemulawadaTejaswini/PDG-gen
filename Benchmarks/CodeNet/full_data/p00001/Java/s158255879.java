public class JavaApplication1 { 
   public static void main(String[] args) {
        // TODO code application logic here
        if (args.length < 2){
            System.out.println("引数を２つ指定してください。");
            System.exit(1);
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int length = a*b;
        int length2 = 2*a+2*b;
        System.out.println(length + " " + length2);
    }
}