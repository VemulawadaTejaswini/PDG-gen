        import java.util.*;
        import java.io.*;
         
        public class Main {
            public static void main(String[] args) throws IOException{
                Scanner scan = new Scanner(System.in);
                String str = scan.nextLine();
                if(str.contains("7")){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
                scan.close();
            }
        }