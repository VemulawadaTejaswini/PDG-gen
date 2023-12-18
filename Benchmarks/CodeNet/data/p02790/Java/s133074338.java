import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        String as = Integer.toString(a);
        String bs = Integer.toString(b);
        StringBuilder str = new StringBuilder(b);
        for(int i =0;i<b;i++){
            str.append(as);
        }
        as = str.toString();   
        str = new StringBuilder("");
        for(int i=0;i<a;i++){
            str.append(bs);
        }
        bs = str.toString();
        System.out.println(as.compareTo(bs)<0?as:bs);
        s.close();
    }
}