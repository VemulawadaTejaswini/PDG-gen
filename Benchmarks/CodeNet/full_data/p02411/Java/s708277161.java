import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            String[] tests=reader.readLine().split(" ");
            
            if(tests[0].equals("-1")&&tests[1].equals("-1")&&tests[2].equals("-1")) break;
            
            if(tests[0].equals("-1")||tests[1].equals("-1")) System.out.println("F");
            else if(Integer.parseInt(tests[0])+Integer.parseInt(tests[1])>=80) System.out.println("A");
            else if(Integer.parseInt(tests[0])+Integer.parseInt(tests[1])>=65) System.out.println("B");
            else if(Integer.parseInt(tests[0])+Integer.parseInt(tests[1])>=50) System.out.println("C");
            else if(Integer.parseInt(tests[0])+Integer.parseInt(tests[1])>=30){
                if(Integer.parseInt(tests[2])>=50) System.out.println("C");
                else System.out.println("D");
            } 
            else if(Integer.parseInt(tests[0])+Integer.parseInt(tests[1])<30) System.out.println("F");
        }
    }
}