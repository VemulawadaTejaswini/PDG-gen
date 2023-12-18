import java.util.*;

public class Main {
           public static void main (args[]){

           BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
           String line;

           try {
                   line = reader.readLine();
                   int number = Integer.parseInt(line);
                   if (number<1200){
                         System.out.println("ABC");
                  } else {
                        System.out.println("ARC");
                 }
                 }catch (IOException e){
                    System.out.println(e);
                 }
}
}
