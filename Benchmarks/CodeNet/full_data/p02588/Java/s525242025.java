import java.lang.Math;
public class Main {
    void run(String args[]){
        Integer limit;
        Integer i=0;
        Integer j=0;
        Double ipair;
        Double jpair;
        Integer count=0;
        String a=args[0];
        limit=Integer.valueOf(a);
        for(i=1;i<=limit;i++){
            ipair=Double.valueOf(args[i]);
            for(j=i;j<=limit;j++){
                jpair=Double.valueOf(args[i]);
                if(Math.ceil(jpair*ipair)==Math.floor(jpair*ipair)){
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String args[]){
        Main printer = new Main();
        printer.run(args);
    }
}