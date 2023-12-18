import java.util.ArrayList;
import java.util.List;

public class Main {

    static java.util.Scanner scan = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        String length = getLine()[0];
       String line = getLine()[0];
       for(int i = 0;i<getLineInts()[0];i++){
           String[] getLine = getLine();
           if(getLine[0] == "1"){
               char[] kasou = line.toCharArray();
               kasou[Integer.valueOf(getLine[1])] = getLine[2].charAt(1);
               line = String.valueOf(kasou);

           }else{
               int count = 0;
               List<String> a = new ArrayList<>();
               for(int j = 0;i<line.toCharArray().length;i++){
                   if(!a.contains(String.valueOf(line.toCharArray()[j]))){
                       a.add(String.valueOf(line.toCharArray()[j]));
                   }
               }
               System.out.println(a.size());



           }
       }

    }




    public static int[] getLineInts(){
        return java.util.stream.Stream.of(getLine()).mapToInt(Integer::parseInt).toArray();
    }

    public static String[] getLine(){
        return scan.nextLine().split(" ");
    }
}
