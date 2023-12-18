public class Main {

    static java.util.Scanner scan = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        String a = getLine()[0];
        if(!a.equalsIgnoreCase("BBB") || !a.equalsIgnoreCase("AAA")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }




    public static int[] getLineInts(){
        return java.util.stream.Stream.of(getLine()).mapToInt(Integer::parseInt).toArray();
    }

    public static String[] getLine(){
        return scan.nextLine().split(" ");
    }
}
