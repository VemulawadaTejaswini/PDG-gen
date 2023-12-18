public class Main {

    class Pair{
        long left = 0;
        long right = 0;
        public long getLeft(){
            return left;
        }
        public long getRight(){
            return right;
        }
    }
    static java.util.Scanner scan = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        char[] input = getLine()[0].toCharArray();
        int[] b = new int[input.length-1];
        int i;
        if(input.length % 2 == 1) {
            for (i = 0; i < (input.length+1)/2; i++) {
                if((i+1)<= input.length) {
                    b[i] = Math.abs(Integer.parseInt(String.valueOf(input[i])) - Integer.parseInt(String.valueOf(input[i + 1])));
                    b[input.length-1-i] = Math.abs(Integer.parseInt(String.valueOf(input[input.length-1-i])) - Integer.parseInt(String.valueOf(input[input.length-i])));
                }
            }
        }else{
            for (i = 0; i < input.length/2; i++) {
                if((i+1)<= input.length) {
                    b[i] = Math.abs(Integer.parseInt(String.valueOf(input[i])) - Integer.parseInt(String.valueOf(input[i + 1])));
                    b[input.length-1-i] = Math.abs(Integer.parseInt(String.valueOf(input[input.length-1-i])) - Integer.parseInt(String.valueOf(input[input.length-i])));
                }
            }
        }
        search(b);
    }
    
    public static void search(int[] a){
        int i;
        int[] b = new int[a.length-1];
        if(b.length == 1){
            System.out.println(b[0]);
            return;
        }
        if(a.length % 2 == 1) {
            for (i = 0; i < (a.length+1)/2; i++) {
                if((i+1)<= a.length) {
                    b[i] = Math.abs(Integer.parseInt(String.valueOf(a[i])) - Integer.parseInt(String.valueOf(a[i + 1])));
                    b[a.length-1-i] = Math.abs(Integer.parseInt(String.valueOf(a[a.length-1-i])) - Integer.parseInt(String.valueOf(a[a.length-i])));
                }
            }
        }else{
            for (i = 0; i < a.length/2; i++) {
                if((i+1)<= a.length) {
                    b[i] = Math.abs(Integer.parseInt(String.valueOf(a[i])) - Integer.parseInt(String.valueOf(a[i + 1])));
                    b[a.length-1-i] = Math.abs(Integer.parseInt(String.valueOf(a[a.length-1-i])) - Integer.parseInt(String.valueOf(a[a.length-i])));
                }
            }
        }
        search(b);
    }

    public static Pair create(long a, long b){
        try {
            Pair pair = Main.class.newInstance().create(a,b);
            pair.left = a;
            pair.right = b;
            return pair;
        }catch (Exception ignore){
            return null;
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
