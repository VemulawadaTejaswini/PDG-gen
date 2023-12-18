    import java.util.*;
    import java.io.*;
     
    public class Main {
        public static void main(String[] args) throws IOException{
            Scanner scan = new Scanner(System.in);
            String str = scan.readLine();
            if(str.contains("7")){
                out.println("Yes");
            }else{
                out.println("No");
            }
            scan.close();
        }
    }