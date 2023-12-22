import java.io.BufferedReader;
import java.io.InputStreamReader;

class P10003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             String[] str = br.readLine().split(" ");
             int num1 = Integer.parseInt(str[0]);
             int num2 = Integer.parseInt(str[1]);
             if(num1 > num2){
                 System.out.println("a > b");
             }
             else if(num1 < num2){
                 System.out.println("a < b");
             }
             else{
                 System.out.println("a == b");
             }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}