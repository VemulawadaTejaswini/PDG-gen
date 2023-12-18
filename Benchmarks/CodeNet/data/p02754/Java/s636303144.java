public class Main {

    static java.util.Scanner scan = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int[] line = getLineInts();
        char[] var = new char[line[0]];
        int i =0;
        boolean f = true;
        int a = 0;
        int b = 0;
        while (i<var.length){
            if(f){
                var[i] = 'a';
                i++;
                a++;
                if(a % line[1] == 0){
                    f = false;
                    a = 0;
                }
            }else{
                var[i] = 'b';
                i++;
                b++;
                if(b % line[2] == 0){
                    f = true;
                    b = 0;
                }
            }
        }
        puts(String.valueOf(var));
    }



    public static void puts(String mes){
        System.out.println(mes);
    }

    public static int[] getLineInts(){
        return java.util.stream.Stream.of(getLine()).mapToInt(Integer::parseInt).toArray();
    }

    public static String[] getLine(){
        return scan.nextLine().split(" ");
    }
}