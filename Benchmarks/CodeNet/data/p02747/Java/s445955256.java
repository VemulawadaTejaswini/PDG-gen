public class Main {

    static java.util.Scanner scan = new java.util.Scanner(System.in);
    public static void main(String[] args) {
       if(getLine()[0].replaceAll("hi","").length() > 0){
           puts("No");
       }else{
           puts("Yes");
       }
    }


    public static void puts(Object mes){
        System.out.println(mes);
    }

    public static long[] getLineLongs(){
        return java.util.stream.Stream.of(getLine()).mapToLong(Long::parseLong).toArray();
    }

    public static int[] getLineInts(){
        return java.util.stream.Stream.of(getLine()).mapToInt(Integer::parseInt).toArray();
    }

    public static String[] getLine(){
        String line = scan.nextLine();
        String[] sp = line.split(" ");
        if(sp.length == 1){
            //System.out.println(line);
            return new String[]{line};
        }else{
            return sp;
        }
    }
}
