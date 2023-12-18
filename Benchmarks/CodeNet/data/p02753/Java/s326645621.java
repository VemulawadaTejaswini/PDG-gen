public class Main {

    static java.util.Scanner scan = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        String a = getLine()[0];
        String[] b = new String[]{
                "AAB","ABA","BAA","BBA","BAB","ABB"
        };
        boolean f = false;
        for(int i = 0;i<6;i++){
            if(b[i].equalsIgnoreCase(a)){
                f = true;
            }
        }
        System.out.println(f?"Yes":"No");
    }




    public static int[] getLineInts(){
        return java.util.stream.Stream.of(getLine()).mapToInt(Integer::parseInt).toArray();
    }

    public static String[] getLine(){
        return scan.nextLine().split(" ");
    }
}
